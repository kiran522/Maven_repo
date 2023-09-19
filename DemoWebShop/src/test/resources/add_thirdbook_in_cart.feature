Feature: Add the Third Book to Cart and Validate

  Scenario: Add the third book to the cart and validate
  Given I navigate to the URL "http://demowebshop.tricentis.com"
  When I click on the book
  And I add the third book to the cart
  Then I should see a confirmation that the book was added to the cart

