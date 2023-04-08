Feature: The registry attempt without entering inputs to the mandatory fields

  Scenario: The registry attempt of users without relevant inputs

    Given  Go to  mainpage
    When Write your admin username and password
    Then Click on Admin, user management page
    And Click on add button
    And Click on saveButton without filling up any mandatory field
    Then The error message shall be visible under each of mandatory field