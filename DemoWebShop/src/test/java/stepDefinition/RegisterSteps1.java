package stepDefinition;

import static org.testng.Assert.assertTrue;

import java.util.Random;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.ReadExcel;

import utility.UpdateExcelForRegister;

import org.testng.Assert;

public class RegisterSteps1 extends Driver {

	
	
	@Given("User on the Home page")
	public void user_on_the_home_page() {
		assertTrue(driver.getTitle().equals("Demo Web Shop"));
		logger.info("Demo Web Shop title is verified");
	}
	@When("User click on Rigster button")
	public void user_click_on_rigster_button() {
		register.clickOnResisterLink();
		
	}
	
	@When("User fill in the personal details")
	public void user_fill_in_the_personal_details() throws Exception {
		String[][] data = ReadExcel.getData("C:\\Users\\Rajib\\eclipse-workspace\\DemoWebShop\\src\\test\\resources\\Data.xlsx", "Sheet1");
		
		
		for(int i=1;i<=2;i++) {
			Random random = new Random();
	        int randomInt = random.nextInt(1000);
			String fname=data[i][0];
			String lname=data[i][1];
			String email=data[i][2];
			String pass=data[i][3];
			String cpass=data[i][4];
			
			register.clickOnRadioBtn();
			
			register.EnterFirstNameTextBox(fname);
			register.EnterLastNameTextBox(lname);
			register.EnterEmailTextBox(email+ randomInt +"@gmail.com");
			register.EnterPasswordTextBox(pass);
			register.EnterConfirmPasswordTextBox(cpass);
			register.clickRigesterBtn();
			try {
				String expected = "Log out";
				String actual = landingpageafterlogin.TheLogout();
				Assert.assertEquals(expected, actual);
				UpdateExcelForRegister updateexcelforreg = new UpdateExcelForRegister();
				updateexcelforreg.writeExcel("Sheet1", "pass", i, 5);
				
			} catch (Exception e) {
				String expected ="Wrong email";
				String actual = register.verfyE();
				Assert.assertEquals(expected, actual);
				UpdateExcelForRegister updateexcelforreg = new UpdateExcelForRegister();
				updateexcelforreg.writeExcel("Sheet1", "Fail", i, 5);
			}

		}
		
		
	}
	@When("User click on the Register button")
	public void user_click_on_the_register_button() {
		
	}
	@When("User should see a Register message")
	public void user_should_see_a_register_message() {
		try {
			assertTrue(driver.getTitle().equals("Demo Web Shop. Register"));
			logger.warn("Title Should be verified");
		} catch (Exception e) {
			logger.warn("registration failed");
		}
			
		
		}
		
	@When("User click on Continue")
	public void user_click_on_continue() throws InterruptedException {
		try {
			register.clickContinueBtn();
		} catch (Exception e) {
			logger.warn("user can not login");
		}
		
	}
	@Then("User should be redirected to the homepage")
	public void user_should_be_redirected_to_the_homepage() {
		try {

			if(!driver.getTitle().equals("Demo Web Shop1")) {

				System.err.println("Title was not correct");

			}

				

			

		} catch (Exception e) {

		

			System.err.println("An exception occured:"+ e.getMessage());

		}
	}
}

