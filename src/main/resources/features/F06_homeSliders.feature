@smoke
Feature: F06 | user could navigate between two sliders
  Scenario Outline:user select a slider and navigate to item page
    Given user navigates to home page
    When user choose the item in slider "<no.>"
    Then user redirected to the item page "<link>"
    Examples:
      | no. | link |
      | 0   | https://demo.nopcommerce.com/nokia-lumia-1020 |
      | 1   | https://demo.nopcommerce.com/iphone-6 |