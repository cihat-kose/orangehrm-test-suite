Feature:Password Functionality

  Scenario:Password control and notification messages
    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    And Click to Admin and click to Add Button
    And Enter less characters than necessary and click the save button
    Then The message Should have at least eight characters should be displayed in red.
