Feature: Major functionalities for smoke test

  Scenario: Validate Home Page title and sign in button
    Then Validate top left corner is "TEKSCHOOL"
    Then Validate sign in button is enabled