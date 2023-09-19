package stepDefinition;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class ShoppingCartTestSteps extends Driver{
	
	@Given("A user is on the landing page of demowebshop")
	public void a_user_is_on_the_landing_page_of_demowebshop() {
		
	}

	@When("he clicks on books")
	public void he_clicks_on_books() {
	    
		
		landingPage.clickBooks();
	}

	
	@When("he adds the first product")
	public void he_adds_the_first_product() {
	    
		
		products.clickFirstProduct();
	}

	@When("he adds the second product")
	public void he_adds_the_second_product() {
	    
		
		products.clickSecondProduct();
	}

	@When("he adds the third product")
	public void he_adds_the_third_product() {
	    
		
		products.clickThirdProduct();
	}

	@When("he removes one of the products")
	public void he_removes_one_of_the_products() {
	    
		
		     shoppingCart.viewShoppingCart();
		     shoppingCart.clickCheckbox();
		     shoppingCart.updateCart();
	}

	@Then("he verifies the shopping cart.")
	public void he_verifies_the_shopping_cart() {
		
		
		String expectedText = "Your Shopping Cart is empty!";
		String actualText = verify.verifyMessage();
		Assert.assertEquals(actualText, expectedText);
		driver.quit();

	    
	}

}
