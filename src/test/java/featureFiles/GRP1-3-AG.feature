Feature:New user create


  Scenario: Create a new user by mandatory fields

    Given Navigate to OrangeHRM
    When Enter username and password and click login button
    And Click to Admin and click to Add Button
    And Enter only mandatory fields and click save button
    Then User should add succesfully
