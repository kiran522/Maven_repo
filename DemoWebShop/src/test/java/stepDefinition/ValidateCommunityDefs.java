package stepDefinition;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.Reporter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.ReadExcel;
import utility.UpdateExcelForLogin;

public class ValidateCommunityDefs extends Driver{
	
	
	@Given("a user is in the landing page")
	public void a_user_is_in_the_landing_page() {
		assertTrue(driver.getTitle().equals("Demo Web Shop"));
		logger.info("Website opens here");
	}
	
	@When("click on poll and try to vote")
	public void click_on_poll_and_try_to_vote() {
	    loginpage.tryVote();
	    logger.warn("You can not vote without Logging in");
	}
	
	@When("found register users can vote")
	public void found_register_users_can_vote() throws InterruptedException {
	    String Expected = "Only registered users can vote.";
	    String Actual = loginpage.failedvote();
	    Assert.assertEquals(Expected, Actual);
	}

	@When("he clicks on Login")
	public void he_clicks_on_login() {
	    loginpage.getlogin();
	}

	@When("entes Email and Password and click on Login")
	public void entes_email_and_password_and_click_on_login() throws Exception{
	
		String[][] data = ReadExcel.getData("C:\\Users\\Rajib\\eclipse-workspace\\DemoWebShop\\src\\test\\resources\\TestData.xlsx", "Sheet1");	
		for(int i=1;i<=2;i++)
		{
		
				String username = data[i][0];
				String password = data[i][1];
				loginpage.enter(username, password);
				loginpage.clicklogin();
				try {
					String expected = "Log out";
					String actual = landingpageafterlogin.TheLogout();
					Assert.assertEquals(expected, actual);
					logger.info("It looged in with the data of row no :"+i);
					UpdateExcelForLogin updateexcelforlogin = new UpdateExcelForLogin();
					updateexcelforlogin.writeExcel("Sheet1", "Pass", i, 2);
					break;
				} catch (Exception e) {
					String expected = "Login was unsuccessful. Please correct the errors and try again.";
					String actual = loginpage.Error();
					Assert.assertEquals(expected, actual);
					logger.info("It failed to looged in with the data of row no :"+i);
					UpdateExcelForLogin updateexcelforlogin = new UpdateExcelForLogin();
					updateexcelforlogin.writeExcel("Sheet1", "Fail", i, 2);
					
					    String screenshotPath = takeScreenshot();
					    Reporter.log( screenshotPath);


					

				
				}
		}
	}

	@When("login success and update excel sheet")
	public void login_success_and_update_excel_sheet() throws Exception {
		String[][] data1 = ReadExcel.getData("C:\\Users\\Rajib\\eclipse-workspace\\DemoWebShop\\src\\test\\resources\\TestData.xlsx", "Sheet1");
		for(int i=1;i<=2;i++)
		{
			
		System.out.println("Updated Result For row - "+ i +" :"+data1[i][2]);
		}
	}
	
	@When("click on poll and vote")
	public void click_on_poll_and_vote() throws IOException {
		try {
			loginpage.tryVote();
			logger.info("New user vote done");
		} catch (Exception e) {
			String Expected = "Do you like nopCommerce?";
		    String Actual = landingpageafterlogin.TheText();
		    Assert.assertEquals(Expected, Actual);
		    logger.info("One user can vote only once");
		    String screenshotPath = takeScreenshot();
		    Reporter.log( screenshotPath);
		}
	}

	@Then("he should not able to vote again")
	public void he_should_not_able_to_vote_again() throws IOException {
		try {
			loginpage.tryVote();
		} catch (Exception e) {
			String Expected = "Do you like nopCommerce?";
		    String Actual = landingpageafterlogin.TheText();
		    Assert.assertEquals(Expected, Actual);
		    logger.info("user already voted");
		}
	}
	
	public String takeScreenshot() throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		String path = "C:\\Users\\Rajib\\eclipse-workspace\\DemoWebShop\\TestReport\\myscreenshot_" + System.currentTimeMillis() + ".png";

 

		File target = new File(path);

		FileUtils.copyFile(source, target);

		String targetPath = target.getAbsolutePath();

		return targetPath;

	}
	
}
