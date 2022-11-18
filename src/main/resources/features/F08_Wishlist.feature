@smoke
Feature: F08 |user able to add items to wishlist
  Background: user navigates to home page
    #Scneario 1
  Scenario: user add an item to wishlist and success message appear
    When user click on wishlist button to add"HTC One M8 Android L 5.0 Lollipop"
    Then user get success message to inform  that item was added to wishlist
    And color of wishlist success message "#4bb07a"

    #Scenario 2
  Scenario: can not add more items more than he have
    When user click on wishlist button to add"HTC One M8 Android L 5.0 Lollipop"
    And user go to wishlist page
    Then user should increase amount of items in wishlist page
