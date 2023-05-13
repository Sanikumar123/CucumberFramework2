package stepdefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import applicationpages.Bankmanagerpage;
import applicationpages.Homepage;
import applicationpages.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.TestContestSetup;

public class BankmanagerloginpageStepdefinition {
	
	WebDriver driver;
    Bankmanagerpage bankManagerPage;
    TestContestSetup testContextSetup;
    Homepage homepage;
    PageObjectManager pageObjectManager;
	
	public BankmanagerloginpageStepdefinition(TestContestSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
	}
	
	@Then("user lands on Bank Manager page")
	public void user_lands_on_bank_manager_page() {
	    
		 
		testContextSetup.pageObjectManager.bankmanagerpage().verifyBankManagerPage();
		
	}
	
	@Given("user Clicks on Add Customer button")
	public void user_clicks_on_add_customer_button() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		testContextSetup.pageObjectManager.homepage().clickManagerBtn();
		 
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		testContextSetup.pageObjectManager.bankmanagerpage().clickAddCustBtn();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
			
			
		
	    
	}
	@When("user enters FirstName, LastName, PostCode and clicks on AddCustomer button")
	public void user_enters_first_name_last_name_post_code_and_clicks_on_add_customer_button() {
	    
		testContextSetup.pageObjectManager.bankmanagerpage().addCustomer("Sani", "Kumar", "ADCVFR");
		
	}
	@Then("Customer should be added successfully")
	public void customer_should_be_added_successfully() {
		Alert alert = testContextSetup.driver.switchTo().alert();
		alert.accept();
		
	}

}
