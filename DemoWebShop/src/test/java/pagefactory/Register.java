package pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Register {


	@FindBy(xpath="//a[contains(@class,'ico-register')]")
	private WebElement ResisterLink;
	

	@FindBy(id="gender-male")
	private WebElement RadioBtn;

	@FindBy(xpath="(//input[contains(@class,'text-box single-line')])[1]")
	private WebElement FirstNameTextBox;


	@FindBy(xpath="(//input[contains(@class,'text-box single-line')])[2]")
	private WebElement LastNameTextBox;
	

	@FindBy(xpath="(//input[contains(@class,'text-box single-line')])[3]")
	private WebElement EmailTextBox;
	
	@FindBy(xpath="(//input[contains(@class,'text-box single-line password')])[1]")
	private WebElement PasswordTextBox;
	
	@FindBy(xpath="(//input[contains(@class,'text-box single-line password')])[2]")
	private WebElement ConfirmPasswordTextBox;
	
	@FindBy(id=("register-button"))
	private WebElement RegisterBtn;

	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[4]/span[2]/span")
	private WebElement regE;
	
	@FindBy(xpath="(//input[contains(@class,'button-1 register-continue-button')])")
	private WebElement ContinueBtn;
	
	JavascriptExecutor js;

	public Register(WebDriver driver)

	{
		js = (JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);


	}

	public void addtoCart() throws InterruptedException {
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView()",ResisterLink);
		js.executeScript("arguments[0].click()",ResisterLink );
		
		js.executeScript("arguments[0].scrollIntoView()",RadioBtn);
		js.executeScript("arguments[0].click()", RadioBtn);



	}
	public void clickOnResisterLink() {
		 ResisterLink.click();
	}
	
	public void clickOnRadioBtn() {
		 RadioBtn.click();
	}

	public void EnterFirstNameTextBox(String FirstName) {
		FirstNameTextBox.clear();
		FirstNameTextBox.sendKeys(FirstName);
	}
	
	public void EnterLastNameTextBox(String LastName) {
		LastNameTextBox.clear();
		LastNameTextBox.sendKeys(LastName);
		
}
	public void EnterEmailTextBox(String Email) {
		EmailTextBox.clear();
		EmailTextBox.sendKeys(Email);
		
}
	public void EnterPasswordTextBox(String Password) {
		PasswordTextBox.clear();
		PasswordTextBox.sendKeys(Password);
		
}
	public void EnterConfirmPasswordTextBox(String ConfirmPassword) {
		ConfirmPasswordTextBox.clear();
		ConfirmPasswordTextBox.sendKeys(ConfirmPassword);
	}
	public void clickRigesterBtn() {
		 RegisterBtn.click();
	}
	

	public String verfyE() {
		return regE.getText();
		
	}
	
	public void clickContinueBtn() throws InterruptedException {
		Thread.sleep(5000);
		 ContinueBtn.click();
	}
}
