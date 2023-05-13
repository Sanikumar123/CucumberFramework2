package applicationpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bankmanagerpage {

WebDriver driver;
	
	public Bankmanagerpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//button[@ng-click='addCust()']")
	WebElement CustBtn;
	
	@FindBy(xpath="//input[@ng-model='fName']")
	WebElement fName;
	
	@FindBy(xpath="//input[@ng-model='lName']")
	WebElement lName;
	
	@FindBy(xpath="//input[@ng-model='postCd']")
	WebElement postCode;
	
	@FindBy(xpath="//button[text()='Add Customer']")
	WebElement addCustBtn;
	
	
	
	
	
	
	public void verifyBankManagerPage()
	{
		CustBtn.isDisplayed();
	}
	
	public void clickAddCustBtn()
	{
		CustBtn.click();
	}
	
	
	public void addCustomer(String Fname, String Lname, String PCode )
	{
		fName.sendKeys(Fname);
		lName.sendKeys(Lname);
		postCode.sendKeys(PCode);
		addCustBtn.click();
		
	}
	
	
}
