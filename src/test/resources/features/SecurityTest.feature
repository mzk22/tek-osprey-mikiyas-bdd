@Regression
Feature: Retail apps security test feature

  Background: Description about the background
    Given User clicks on sign in button

@Security_Positive
  Scenario Outline: Valid user credential
    When User enters "<username>" and "<password>" and clicks on login
    Then User will see account button on homepage

    Examples:
      | username                     | password    |
      | mohammad_osprey@tekschool.us | 12345678Ab@ |
      | mansoor@gmail.com            | Ruya@2014   |
  #@[tag name] lets you run only specified scenarios
  @Security_Negative
  Scenario Outline: Validate Sign in with Invalid Credentials
    When User enters "<username>" and "<password>" and clicks on login
    Then validate error message "<errorMessage>"

    Examples:
      | username          | password      | errorMessage               |
      | Wrong@gmail.com   | 12345678Ab@   | wrong username or password |
      | mansoor@gmail.com | wrongPassword | wrong username or password |
      | wrong@gamil.com   | wrongPassword | wrong username or password |