Feature: Verifying the presence of add button after clicking admin user management page

  Scenario: The visibility of addButton to the admin user
    Given Go to  mainpage of the test object
    When Write your admin username and password respectively
    And Click on Admin, user management page on the website
    Then Verify the visibility of addButton on the current page