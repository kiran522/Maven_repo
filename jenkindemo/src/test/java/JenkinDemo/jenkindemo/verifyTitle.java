package JenkinDemo.jenkindemo;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class verifyTitle {
  WebDriver driver;

@BeforeTest
public void launchApplication()
{
	driver = new ChromeDriver();
	
	driver.get("https://facebook.com");
}
@Test
public void titleVerification() {
	String expect = "Facebook - log in or sign up";
	String actual = driver.getTitle();
	Assert.assertEquals(actual,expect);
}
@AfterTest
public void closeBrowser() {
	driver.quit();
}
}
