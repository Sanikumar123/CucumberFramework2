package utility;

import org.openqa.selenium.WebDriver;

import applicationpages.PageObjectManager;



public class TestContestSetup {
	
	
	public WebDriver driver;
	
	public PageObjectManager pageObjectManager;
	
	
	public TestContestSetup()
	{
		TestBase base = new TestBase();
		driver = base.setUp();
		pageObjectManager = new PageObjectManager(driver);
	}


}
