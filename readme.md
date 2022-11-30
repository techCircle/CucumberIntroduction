Dependencies
- JUnit 5 (Jupiter)
- Selenium Java
- WebDriverManager
- Cucumber Java (io.cucumber)

Plugin
- Cucumber for Java
- Gherkins


Cucumber 
Testing tool that implement BDD style
BDD - Behavior Driven Development 


Tester, Developer, Business (BA, PO)

Feature file 
- features of the app,
- scenarios
  - Gherkin Language
    - Given: precondition
    - When: action
    - Then: validation (expected result)
    - And/But: 

```gherkin
Feature: Login Feature
Scenario: user login with valid username and password
  Given user lands on login page
  When user enter valid username
  And user enter valid passowrd
  And user clicks on Login Button
  Then user should land on the dashboard page
  And username should be display on the header
```

----
So far, 
## Cucumber components
- feature file
- step definitions
- runner class