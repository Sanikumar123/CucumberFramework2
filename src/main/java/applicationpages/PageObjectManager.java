package applicationpages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	WebDriver driver;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public Homepage homepage()
	{
		Homepage homepage = new Homepage(driver);
		return homepage;
	}
	
	
	public Bankmanagerpage bankmanagerpage()
	{
		Bankmanagerpage bankManagerPage = new Bankmanagerpage(driver);
		return bankManagerPage;
	}

}
