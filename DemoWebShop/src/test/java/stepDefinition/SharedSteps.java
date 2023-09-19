package stepDefinition;


import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import pagefactory.CheckOutPage;
import pagefactory.DigitalDownloadPage;
import pagefactory.FifthBook;
import pagefactory.FirstBook;
import pagefactory.HomePage;
import pagefactory.HomePage1;
import pagefactory.LandingPage;
import pagefactory.LandingPageAfterLogin;
import pagefactory.LoginPage;
import pagefactory.Products;
import pagefactory.Register;
import pagefactory.ShoppingCart;
import pagefactory.ThirdBook;
import pagefactory.Verify;
import pagefactory.VerifyFirstBook;
import pagefactory.VerifyThirdBook;
import pagefactory.WishListPage;
import pagefactory.searchStore;
import pagefactory.validatingPage;

import org.apache.log4j.Level;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;


public class SharedSteps extends Tools{
	

	@Before
	public void setUp(Scenario scenario) {
		Driver.init();
		
	}

	@After
	public void tearDown() {
		driver.quit();
	}
}


class Driver extends Tools{
	public static RequestSpecification httprequest;
	public static Response response;
	
	public static Logger logger;
	protected static LoginPage loginpage;
	protected static LandingPageAfterLogin landingpageafterlogin;
	protected static Register register;
	protected static searchStore SearchStore;
	protected static validatingPage ValidatingPage;
	 protected static HomePage homepage;
	 protected static FirstBook firstbook;
	 protected static VerifyFirstBook verifyfirstbook;
	 protected static ThirdBook thirdbook;
	 protected static  VerifyThirdBook verifythirdbook;
	 protected static   FifthBook fifthbook ;
	 protected static HomePage1 homepage1;
		protected static CheckOutPage checkoutpage ;
		protected static DigitalDownloadPage digitalDownloadPage;
		protected static  WishListPage  wishListPage;
		protected static LandingPage landingPage;
		protected static Products products;
		protected static ShoppingCart shoppingCart;
		protected static Verify verify;
		
	public static void init() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demowebshop.tricentis.com/");
	    loginpage = new LoginPage(driver);
	    landingpageafterlogin = new LandingPageAfterLogin(driver);
	    register =new Register(driver);
	    SearchStore =new searchStore(driver);
		ValidatingPage = new validatingPage(driver);
		homepage=new HomePage(driver);
	     firstbook = new FirstBook(driver);
	     verifyfirstbook = new VerifyFirstBook(driver);
	     thirdbook = new ThirdBook(driver);
	      verifythirdbook = new VerifyThirdBook(driver);
	      fifthbook = new FifthBook(driver);
	      homepage1 = new HomePage1(driver);
			 checkoutpage = new CheckOutPage(driver);
			 digitalDownloadPage = new DigitalDownloadPage(driver);
				wishListPage = new  WishListPage(driver);
				landingPage = new LandingPage(driver);
				products = new Products(driver);
				shoppingCart = new ShoppingCart(driver);
				verify = new Verify(driver);
				
	    
	    logger = Logger.getLogger("LogDemo");
		PropertyConfigurator.configure("log4j.properties");
		logger.setLevel(Level.DEBUG);
	    
}
}














