package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import applicationpages.Homepage;
import applicationpages.PageObjectManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utility.TestContestSetup;


public class HomepageStepdefinitions {
	
	WebDriver driver;
	Homepage homepage;
	TestContestSetup testContextSetup;
	 PageObjectManager pageObjectManager;
	
	public HomepageStepdefinitions(TestContestSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
	}

	
	
	
	
	@Given("user is landed on the homepage")
	public void user_is_landed_on_the_homepage() {
		
		testContextSetup.pageObjectManager.homepage().verifyHomeBtn();
	
	}
	@And("can see Customer login and Bank Manager login buttons on the page")
	public void can_see_customer_login_and_bank_manager_login_buttons_on_the_page() {
		testContextSetup.pageObjectManager.homepage().verifyCustBtnAndManagerBtn();
	}
	
	@When("user clicks on Bank Manager Login button")
	public void user_clicks_on_bank_manager_login_button() {

	
		testContextSetup.pageObjectManager.homepage().clickManagerBtn();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
