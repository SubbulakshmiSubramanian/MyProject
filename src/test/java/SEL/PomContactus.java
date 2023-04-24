package SEL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PomContactus {
	
	WebDriver driver;
	
	@FindBy(id="text-77525447616") WebElement firstname;
	@FindBy(id="text-95374915097") WebElement lastname;
	@FindBy(id="text-27022866830") WebElement email;
	@FindBy(id="field-tIgxvmTMez6ibt1") WebElement phone;
	@FindBy(id="field-kJfKGbPLNi5yFI7") WebElement Message;
	@FindBy(id="button-18782068913") WebElement send;
	
	
	  public PomContactus(WebDriver driver) 
	  { 
		  PageFactory.initElements(driver,this);
	  }
	 
	
	public void typefirstname(String name)
	{
		firstname.sendKeys(name);
		
	}
	public void typelastname(String name)
	{
		lastname.sendKeys(name);
	}
	
	}
