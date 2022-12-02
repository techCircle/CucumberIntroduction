Feature: Login

  Background: Navigate to login page
    Given user lands on the login page
    # you can add multiple steps here

  @test @smoke @regression
  # you add multiple tags
  Scenario: User login with valid username and valid password
    When user enters username "valid_username"
    And user enters password "valid_password"
    And user clicks on the login button
    Then user should land on the product page

  @regression
  Scenario: User login with invalid username and valid password
    When user enters username "invalid_username"
    And user enters password "valid_password"
    And user clicks on the login button
    Then user should see warning message "wrong username"
#
  Scenario Outline: User login with wrong credentials
    When user enters username "<username>"
    And user enters password "<password>"
    And user clicks on the login button
    Then user should see warning message "<msg>"
    Examples:
      | username | password           | msg                       |
      | user1    | pass13456467567dfg | wrong username, try again |
      |          | pasdf              | username is missing       |
      | user4    |                    | password is missing       |

  Scenario: Verify menu on homepage
    Given user land on "www.stackoverflow.com"
    Then user should see following menus
    |About|
    |Products|
    |For Teams|