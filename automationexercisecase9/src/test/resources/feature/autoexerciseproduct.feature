@Product
  Feature: automation exercise product test
    Scenario: automation exercise test
      Given user goes to the site
      And user clicks on Products button
      And user click men category
      And user selects tshirths
      And user clicks View Product in Pure Cotton V-Neck T-Shirt
      And user clicks Add to cart button
      And user verifies that Added! is visible
      And user clicks Continue shopping button
      And user clicks Cart button
      And user clicks Proceed to Checkout
      And user clicks Login button
      And user enters email and password
      And user clicks last Login button
      And user clicks Cart button again
      And user clicks final Proceed to Checkout
      And user writes message
      And user clicks Place Order button
      And user enters cart information
      And user clicks on Pay and Confirm Order button
      And user verifies that Congratulations! Your order has been confirmed! message is visible
      Then user enters Continue button
      