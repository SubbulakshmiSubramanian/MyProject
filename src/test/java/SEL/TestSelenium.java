package SEL;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSelenium {
	
	WebDriver driver;
	@BeforeSuite
	public void driversetup()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
	}

	@BeforeMethod
	public void before()
	{
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(op);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
	}
	
	@DataProvider(name="getdata")
	public Object[][] search()
	{
		return new Object[][] {{"Roicians"},{"Roicians Automation Testing"},{"RoiciansQA"}};
	
	}
	@Test(dataProvider="getdata")
	public void Display(String Keywords) throws InterruptedException
	{
		driver.findElement(By.cssSelector(".gLFyf")).sendKeys(Keywords);
		Thread.sleep(2000);
	}
	 @AfterMethod 
	  public void aftermethod() 
	  {
		  driver.close();
	  }
	 
	}
