package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utility.TestContestSetup;

public class Hooks {
	
TestContestSetup testContextSetup;
	
	public Hooks(TestContestSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
	}
	
	
	@AfterStep
	public void addScreenshot(Scenario scenario) throws IOException {

		if(scenario.isFailed())
		{

		TakesScreenshot shot =(TakesScreenshot) testContextSetup.driver;
		byte[] fileContent = shot.getScreenshotAs(OutputType.BYTES);
		//byte[] fileContent = FileUtils.readFileToByteArray(source);
		scenario.attach(fileContent, "image/png", "screenshot");
		
		}
		
		
		
		}
	
	@After
	public void quit()
	{
		testContextSetup.driver.close();
	}
	
	

}
