package stepDefinition;

import static org.testng.Assert.assertTrue;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;





public class AddThirdBookinCartDefs extends Driver{
	
	
	@Given("I navigate to the URL {string}")
	public void i_navigate_to_the_url(String string) {
		assertTrue(driver.getTitle().equals("Demo Web Shop"));
		logger.info("Website opens here");
	}

	@When("I click on the book")
	public void i_click_on_the_book() {
		homepage.clickBooks();
	}

	@When("I add the third book to the cart")
	public void i_add_the_third_book_to_the_cart() {
		thirdbook.clickBook3();
	}

	@Then("I should see a confirmation that the book was added to the cart")
	public void i_should_see_a_confirmation_that_the_book_was_added_to_the_cart() throws InterruptedException {
		verifythirdbook.verifyBook3();
		Thread.sleep(2000);
	    String expected = "The product has been added to your shopping cart";
	    String actual = verifythirdbook.getAddToCart();
	    Assert.assertEquals(expected, actual);
	}
}