package Pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseHRMClass;

public class PomLogin extends BaseHRMClass{
//object repository
	@FindBy(name="username") WebElement Username;
	@FindBy(name="password") WebElement Password;
	@FindBy(className="oxd-button") WebElement Loginbtn;
	
	
	//driver.findElement(By.className("dialog-confirm")).click();

	
//initiate page elements
	public PomLogin() 
	{
		PageFactory.initElements(driver, this);
		
	}
	public void typeusername(String name)
	{
		Username.sendKeys(name);
	}
	public void typepassword(String pass)
	{
		Password.sendKeys(pass); 
	}
	public void clickbtn()
	{
		Loginbtn.click();
	}
	public String verify()
	{
		return driver.getTitle();
	}
}
