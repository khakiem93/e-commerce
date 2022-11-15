@smoke
Feature: F05 | user could hover to any category and select sub-category
  Scenario: user hover to Computers category then select Desktops subcategory
    Given user navigates to home page
    When user hover to Computers category
    And user selects Desktop subcategory
    Then user should be navigate to subcategory page "https://demo.nopcommerce.com/desktops"