@smoke
  Feature: F04 | user search for product
    Scenario Outline: search using item name
      #first Scenario
       Given user navigates to home page
      When user click on search
      And user enter search value "<item name>"
      And user click on search button
      Then url contains search url
     And search shows relevant results "<item name>"
      Examples:
        | item name |
        | book |
        | laptop |
        | nike |

#      #second Scenario
#    Scenario Outline: search using item sku
#      Given user navigates to home page
#      When user click on search
#      And user enter search value "<item sku>"
#      And user click on search button
#      Then url contains search url
#      And search shows relevant results "<item sku>"
#      Examples:
#        | item sku |
#        | SCI_FAITH |
#        | APPLE_CAM |
#        | SF_PRO_11 |