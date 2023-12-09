Feature: LoggedIn User

  Scenario: Log into Wilko website as a valid user
    Given User navigates to the Wilko website
    And User clicks on account button
    When User enters valid login credentials
    And User clicks on login button
    Then User should be logged in successfully

  Scenario: Log into Wilko website as a invalid user
    Given User navigates to the Wilko website
    And User clicks on account button
    When User enters invalid login credentials
    And User clicks on login button
    Then User should be able to see error message