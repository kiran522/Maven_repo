Feature: Demo Web Shop

Scenario: Successful user registration
Given User on the Home page
When User click on Rigster button
And User fill in the personal details
And User click on the Register button
And User should see a Register message
And User click on Continue
Then User should be redirected to the homepage




 
  Scenario: search the product from excel sheet
    Given a user is on the landing page
    When he click login button
    And he writes product name 
    And he clicks on search button
    Then he must be able to verify the product "Delivery date:"
    
    



Scenario: A user must be in able to validate community poll
Given a user is in the landing page
When click on poll and try to vote
And found register users can vote
And he clicks on Login
And entes Email and Password and click on Login
And login success and update excel sheet
And click on poll and vote
Then he should not able to vote again




Scenario: confirm all the books having “AddToCart”button
Given  a user is on the landing page of demowrbshop
When he clicks on books in the navigation bar
And he clicks on the firstbook
And he verify the 'add to cart'  button  in the first book
And Again clicks on books in the navigation bar
And he clicks on the secondbook
And he verify the 'add to cart' button in second book
And Again clicks on books in the navigation bar
And he clicks on the thirdbook
And he verify the 'add to cart' button in third book
And Again clicks on books in the navigation bar
And he clicks on the fourthbook
And he verify the 'add to cart' button in fourth book
And Again clicks on books in the navigation bar
And he clicks on the fifthbook
And he verify the 'add to cart' button in fifth book
And Again clicks on books in the navigation bar
And he clicks on the sixthbook
And he verify the 'add to cart' button in sixth book
Then confirm all the books having "AddToCart"button





  Scenario: Add the third book to the cart and validate
  Given I navigate to the URL "http://demowebshop.tricentis.com"
  When I click on the book
  And I add the third book to the cart
  Then I should see a confirmation that the book was added to the cart





Scenario: the user added the book Successfully
Given a user is on the landing page of DemoWebShop
When he clicks on the books in the navigate bar
And he clicks on third book
And he added to cart
And he clicks on shopping cart
And he clicks on checkbox
And he clicks on checkout
And he clicks on continue button in billing address
And he clicks on 'in-store pickup' checkbox
And he clicks on continue button in shipping address
And he clicks on continue button in payment method
And he clicks on continue button in payment information
And he clicks on confirm button in Confirm Order
And he verify 'Your order has been successfully processed!' text present or not
Then he clicks on continue button in Thankyou






Scenario: A user must be able to add or remove products

Given A user is on the landing page of demowebshop
When he clicks on books
And he adds the first product
And he adds the second product
And he adds the third product
And he removes one of the products
Then he verifies the shopping cart.





  Scenario: Add and Remove Products from Wishlist
    Given User is on the homepage of the demo webshop
    When User click on "Digital Downloads"
    And User add all products to the wishlist
    And User go to the wishlist and remove all products
    Then User should see the message "The wishlist is empty!"
	