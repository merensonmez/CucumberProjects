@SaucedemoTest
  Feature: saucedemo site test
    Scenario: user places an order and confirms it
      Given user goes to the site
      And user logs in by entering information
      And user clicks on the product to buy
      And user clicks on add to card
      And user verifies that they added it to the card
      And user comes to the purchase section
      And user clicks on checkout
      And user enters information
      And user checks that has entered the correct user information
      And user clicks finish
      Then user confirms that the order has been placed message