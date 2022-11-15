@smoke
Feature: F01_Register | users could register with new accounts


  Scenario: guest user could register with valid data successfully
  Given user go to register page
    When user select gender type "male"
    And user enter "automation" and "tester"
    And user enter date of birth "23" and "July" and "1993"
    And user enter email "test-khalid5@example.com"
    And  user enter passWord "P@ssw0rd"
    And  confirm password "P@ssw0rd"
    And  user clicks on register button
    Then user get  success message
