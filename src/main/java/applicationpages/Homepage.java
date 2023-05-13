package applicationpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	WebDriver driver;
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//button[@ng-click='customer()']")
	WebElement loginBtn;
	
	@FindBy(xpath="//button[@ng-click='manager()']")
	WebElement managerBtn;
	
	@FindBy(xpath="//button[@ng-click='home()']")
	WebElement homeBtn;
	
	
	
	
	public void verifyHomeBtn()
	{
		homeBtn.isDisplayed();
	}
	
	
	
	public void verifyCustBtnAndManagerBtn()
	{
		loginBtn.isDisplayed();
		managerBtn.isDisplayed();
	}
	
	public void clickManagerBtn()
	{
		managerBtn.click();
	}
	
	
	

}
