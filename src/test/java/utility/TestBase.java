package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	FileInputStream fin;
	
	WebDriver driver;
	public WebDriver setUp()
	
	{
		try {
			 fin = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\configuration\\Config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			Properties prop = new Properties();
			try {
				prop.load(fin);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		
		if(prop.getProperty("Browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91898\\Downloads\\chromedriver_win32 (10)\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if(prop.getProperty("Browser").equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\91898\\Downloads\\chromedriver_win32 (9)\\chromedriver.exe");
			driver = new FirefoxDriver();
			
		}else  if(prop.getProperty("Browser").equals("edge"))
		{
			System.setProperty("webdriver.msedge.driver", "C:\\Users\\91898\\Downloads\\chromedriver_win32 (9)\\chromedriver.exe");
			driver = new EdgeDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.get(prop.getProperty("TestURL"));
		
		return driver;
		
	}
	

}
