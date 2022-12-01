Feature: User able to login

  @test @smoke @regression
  # you add multiple tags
  Scenario: User login with valid username and valid password
    # add steps
    Given user lands on the login page
#    When user enters valid username
#    And user enters valid password
#    And user clicks on the login button
#    Then user should land on the product page

  @regression
  Scenario: User login with invalid username and valid password
#    # add steps
    Given user lands on the login page
#    When user enters invalid username
#    And user enters valid password
#    And user clicks on the login button
#    Then user should see warning message
#
  Scenario: User login with valid username and invalid password
#    # add steps
    Given user lands on the login page
#    When user enters valid username
#    And user enters invalid password
#    And user clicks on the login button
#    Then user should see warning message