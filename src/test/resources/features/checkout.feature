Feature: Checkout process at SauceDemo
  As a standard user
  I want to add products to my cart and complete the checkout process
  So that I can successfully purchase items

  Scenario: Successful purchase of two products
    Given that a standard user logs into SauceDemo
    When the user adds two products to the cart
    And navigates to the cart to checkout
    And fills out the checkout form with personal data
    And finishes the purchase
    Then the user should see the exact confirmation message "THANK YOU FOR YOUR ORDER"
