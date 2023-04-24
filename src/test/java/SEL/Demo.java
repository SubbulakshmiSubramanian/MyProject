package SEL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver=new ChromeDriver(op);
		
		driver.get("https://demoqa.com/alerts");
		
		
		/*
		 * driver.findElement(By.id("alertButton")).click(); Alert
		 * a=driver.switchTo().alert(); a.accept();
		 */
		 
		 
		  driver.findElement(By.id("timerAlertButton")).click(); WebDriverWait wait=new
		  WebDriverWait(driver,Duration.ofSeconds(6));
		  wait.until(ExpectedConditions.alertIsPresent()); 
		  Alert a=driver.switchTo().alert(); a.accept();
		 
			 
		/*
		 * driver.findElement(By.id("confirmButton")).click(); Alert
		 * a=driver.switchTo().alert(); a.dismiss();
		 */
			 
		/*
		 * driver.findElement(By.id("promtButton")).click(); Alert
		 * a=driver.switchTo().alert(); a.sendKeys("abcd"); a.accept();
		 */
		  //Authentication popup
		  driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
			 
	}

}
