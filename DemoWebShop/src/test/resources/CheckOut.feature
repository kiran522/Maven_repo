Feature: Add the third book into the cart

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

