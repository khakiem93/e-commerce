@smoke
Feature: F03_currencies | users select currency

Scenario: user click Customer Currency
  Given user go to home page
  When user select Currency "Euro" from list
  Then prices of items will be in "€"



