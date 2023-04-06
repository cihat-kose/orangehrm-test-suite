Feature: Verifying the presence of add button after clicking admin user management page

  Scenario: the visibility of addbutton to the admin user
    Given Go to the mainpage
    When Write your admin username and password
    And Click on Admin, user management page
    Then Verify the visibility of addButton on the current page
