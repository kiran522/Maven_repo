package stepDefinition;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.CheckOutPage;


public class CheckOut extends Driver {
	
	@Given("a user is on the landing page of DemoWebShop")
	public void a_user_is_on_the_landing_page_of_demo_web_shop() {
		
        
        driver.findElement(By.xpath("//a[contains(@class,'ico-login')]")).click();
		driver.findElement(By.id("Email")).sendKeys("Itest@test.com");
		driver.findElement(By.id("Password")).sendKeys("Itest@test");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
        
	}

	@When("he clicks on the books in the navigate bar")
	public void he_clicks_on_the_books_in_the_navigate_bar() {
		homepage1.clickBooks();
		logger.info("clicks on Books");
	}

	@When("he clicks on third book")
	public void he_clicks_on_third_book() {
		homepage1.clickthirdbook();
		logger.info("clicks on thirdBooks");
	}

	@When("he added to cart")
	public void he_added_to_cart() {
		
		homepage1.clickaddtocart();
		logger.info("Added to cart");
	}

	@When("he clicks on shopping cart")
	public void he_clicks_on_shopping_cart() {
		homepage1.clickshoppingcart();
		logger.info("clicks on shoppingcart");
	}

	@When("he clicks on checkbox")
	public void he_clicks_on_checkbox() {
		homepage1.clickcheckbox();
		logger.info("clicks on checkbox");
	}

	@When("he clicks on checkout")
	public void he_clicks_on_checkout() {
		homepage1.clickcheckout();
		logger.info("clicks on checkout");
	    
	}
	
	@When("he clicks on continue button in billing address")
	public void he_clicks_on_continue_button_in_billing_address() {
	    checkoutpage.billingAdr();
	    logger.info("clicks on continue button in billing address");
	}

	@When("he clicks on {string} checkbox")
	public void he_clicks_on_checkbox(String string) throws InterruptedException  {
	    CheckOutPage checkoutpage = new CheckOutPage(driver);
	    //wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	    Thread.sleep(2000);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
	    checkoutpage.clickpickup();
	    logger.info("he clicks on in-store pickup checkbox");

	}

	@When("he clicks on continue button in shipping address")
	public void he_clicks_on_continue_button_in_shipping_address() throws InterruptedException  {
	    Thread.sleep(2000);
	    checkoutpage.shippingadr();
	    logger.info("he clicks on continue button in shipping address");

	}

	@When("he clicks on continue button in shipping method")
	public void he_clicks_on_continue_button_in_shipping_method() {
	   
	   
	}

	@When("he clicks on continue button in payment method")
	public void he_clicks_on_continue_button_in_payment_method() throws InterruptedException  {
		Thread.sleep(2000);
		checkoutpage.paymthd();
		logger.info("he clicks on continue button in payment method");
	    
	}

	@When("he clicks on continue button in payment information")
	public void he_clicks_on_continue_button_in_payment_information() throws InterruptedException  {
		Thread.sleep(2000);
		checkoutpage.payinfo();
		logger.info("he clicks on continue button in payment information");
	    
	}

	@When("he clicks on confirm button in Confirm Order")
	public void he_clicks_on_confirm_button_in_confirm_order() throws InterruptedException  {
		Thread.sleep(2000);
		checkoutpage.clickconfirmbtn();
		logger.info("he clicks on confirm button in Confirm Order");
  
	}

	@When("he verify {string} text present or not")
	public void he_verify_text_present_or_not(String string) throws InterruptedException  {
		Thread.sleep(2000);
		String expectedText = "Your order has been successfully processed!";
	    String actualText = checkoutpage.getOrderText();
	    Assert.assertEquals(actualText, expectedText);
	    logger.info("Verify the text");
	    
	}
	@Then("he clicks on continue button in Thankyou")
	public void he_clicks_on_continue_button_in_thankyou() throws InterruptedException {
		Thread.sleep(2000);
		checkoutpage.clickbtnthanku();
		logger.info("he clicks on continue button in Thankyou");
	}


}
