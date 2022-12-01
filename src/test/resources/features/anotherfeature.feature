# test feature
Feature: test

  Scenario: Do some math
    Given I have 1
    And I have 10
    When I add them together
    Then It should be 20

  Scenario: it should not be equal
    Given I have 10
    And I have 20
    When I add them together
    Then It should not be 20


    Scenario: String parameter
      Given I have "ten" dollars
      And I have "twenty" dollars
      When I buy "milk" and "bananas"
      And I buy "water" for 3.59 dollars