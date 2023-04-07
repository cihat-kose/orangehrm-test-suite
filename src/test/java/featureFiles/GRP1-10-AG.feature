Feature:Elements are Displayed


  Scenario: The required elements are displayed

    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    And Click to Admin and click to Add Button
    Then I verify that all the required elements are displayed
