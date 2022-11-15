@smoke
Feature: F02_Login | users could use login functionality to use their accounts

  Background: user open browser and go to login page
    And user navigates to login page




#first scenario
  Scenario: user could login with valid email and password
    When user login "test-khalid5@example.com" and "P@ssw0rd"
  And  user press on login button
  Then user login to the system successfully

#second scenario
  Scenario: user could login with invalid email and password
    When user login "wrong@example.com" and "P@ssw0rd"
    And user press on login button
    Then user could not login to the system