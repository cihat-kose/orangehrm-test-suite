Feature:Mandatory Fields Functionality

  Scenario: Saving mandatory fields without filling them in
    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    And Click to Admin and click to Add Button
    And Click save button
    Then Notification messages should be displayed red color