package SEL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Browse {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(op); 
		
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.roicians.com/contact-us/");
		PomContactus con=new PomContactus(driver); 
		con.typefirstname("Roicians");
		
		
		
		
		
		/*
		 * WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		 * wait.until(ExpectedConditions.elementToBeSelected(By.id("text-77525447616")))
		 * ;
		 */
		
		
		
		
		
		
		/*
		 * driver.findElement(By.id("text-77525447616")).sendKeys("Roicians");
		 * driver.findElement(By.id("text-95374915097")).sendKeys("Tech");
		 * driver.findElement(By.id("text-27022866830")).sendKeys(
		 * "subbulakshmi.csg@gmail.com");
		 * driver.findElement(By.id("field-tIgxvmTMez6ibt1")).sendKeys("1234567890");
		 * driver.findElement(By.id("field-kJfKGbPLNi5yFI7")).sendKeys("Hello");
		 * driver.findElement(By.id("button-18782068913")).click();
		 */
	}

}
