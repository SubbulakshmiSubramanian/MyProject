package BasePackage;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v107.io.IO;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import Utility.TimeUtils;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;


public class BaseHRMClass {
	public static Properties prop=new Properties();
	public static WebDriver driver; 
	//step1
	public BaseHRMClass() 
	{
		try
		{
			
		FileInputStream file=new FileInputStream("C:\\Users\\subbu\\OneDrive\\Documents\\Webbbased\\src\\test\\java\\Environmentvariables\\config.properties");
		prop.load(file);
	    }
		catch(FileNotFoundException e )
		{
			e.printStackTrace();
		}
		catch(IOException a)
		{
			a.printStackTrace();
		}
	}
	//step2
		
		public static void initiate()
		{
			String browsername=prop.getProperty("browser");
			if(browsername.equals("Firefox"))
			{
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
				FirefoxOptions op=new FirefoxOptions();
				op.setBinary("C:\\Program Files\\Mozilla Firefox/firefox.exe");
				//op.addArguments("--remote-allow-origins=*");
				driver=new FirefoxDriver(op);
			}
			else if(browsername.equals("chrome"))
			{
				
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				ChromeOptions op=new ChromeOptions();
				op.addArguments("--remote-allow-origins=*");
				driver=new ChromeDriver(op); 
			}
				
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(prop.getProperty("url"));
		}
			
	 
public static void screenshots(String Filename) {
	File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
	FileUtils.copyFile(file, new File("C:\\Users\\subbu\\OneDrive\\Documents\\Webbbased\\src\\test\\java\\screenshots\\Screenshots"+Filename+".jpg"));
}
	catch(IOException e) {
		e.printStackTrace();
	}
}}