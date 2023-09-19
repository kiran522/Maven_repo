package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyThirdBook {
	@FindBy(id= "add-to-cart-button-45")
	WebElement verify3;
	
	@FindBy(xpath = "//p[contains(@class,'content')]")
	private WebElement verifytext;
	
	public VerifyThirdBook(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
public void verifyBook3() {
	verify3.click();
}
public String getAddToCart() {
	return verifytext.getText();

}
}
