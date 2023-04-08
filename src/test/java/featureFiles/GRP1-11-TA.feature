Feature: Testing Orange HRM

  Scenario: Add User heading when an Admin is logining


    Given Navigate to site
    Then Login as Admin
    And Navigate to Admin page
    When Click Add button
    Then Verify that Add User heading is displayed