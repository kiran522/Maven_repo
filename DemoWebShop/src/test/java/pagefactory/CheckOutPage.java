package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	@FindBy(xpath = "(//input[contains(@type,'button')])[2]")
	WebElement continuebtn;
	@FindBy(id = "PickUpInStore")
	WebElement instorepickup;
	@FindBy(xpath = "(//input[contains(@type,'button')])[3]")
	WebElement continuebtn2;
	@FindBy(xpath = "(//input[contains(@type,'button')])[5]")
	WebElement continuebtn3;
	@FindBy(xpath = "(//input[contains(@type,'button')])[6]")
	WebElement continuebtn4;
	@FindBy(xpath = "(//input[contains(@type,'button')])[7]")
	WebElement confirmbtn;
	@FindBy(xpath = "(//div[contains(@class,'title')])[2]")
    WebElement ordertext;
	@FindBy(xpath = " //input[contains(@type,'button')]")
	WebElement continuebtn5;
	
	public CheckOutPage(WebDriver driver) {
		   PageFactory.initElements(driver, this);
	   }
	public void  billingAdr() {
		   continuebtn.click();
	   }
	public void clickpickup() {
		instorepickup.click();
	}
	public void shippingadr() {
		continuebtn2.click();
	}
	public void paymthd() {
		continuebtn3.click();
	}
	public void payinfo() {
		continuebtn4.click();
	}
	public void clickconfirmbtn() {
		confirmbtn.click();
	}
	public String getOrderText() {
		String text = ordertext.getText();
		return text;
	}
	public void clickbtnthanku() {
		continuebtn5.click();
	}

}
