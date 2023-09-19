package runners;

import org.testng.annotations.Listeners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
//		features = {
//					"src/test/resources/ValidateCommunityPoll.feature",    //Rajib
//					"src/test/resources/RegisterSteps.feature",				//prajwal
//					"src/test/resources/search.feature",					//kiran rout
//					"src/test/resources/verify_add_to_cart.feature",		//botha sai kiran
//					"src/test/resources/add_thirdbook_in_cart.feature", 	//mansi
//					"src/test/resources/CheckOut.feature",					//akhila
//					"src/test/resources/DigitalDownloadWishlist.feature",	//meghna
//					"src/test/resources/shopping_cart.feature"				//srijit
//		}, 
//		features = {"src/test/resources/all_feature.feature"},
		glue = "stepDefinition"
		)

@Listeners(utility.TestListener.class)
public class TestRunner extends AbstractTestNGCucumberTests{
}


