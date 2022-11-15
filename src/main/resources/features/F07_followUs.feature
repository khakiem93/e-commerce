@smoke
Feature: F07 | user follow using social media icons
  Scenario Outline: user navigate to social media links for (Facebook,Twitter,RSS,Youtube)
    Given user navigates to home page
    When user click on "<social>" icon
    Then user redirected to the required page "<link>"
    Examples:
      | social | link |
      | facebook | https://web.facebook.com/nopCommerce |
      | twitter  | https://twitter.com/nopCommerce      |
      | rss      | https://demo.nopcommerce.com/new-online-store-is-open |
      | youtube  | https://www.youtube.com/user/nopCommerce              |