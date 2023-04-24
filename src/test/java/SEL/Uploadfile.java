package SEL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			ChromeOptions op=new ChromeOptions();
			op.addArguments("--remote-allow-origins=*");
			ChromeDriver driver=new ChromeDriver(op);
			driver.get("https://www.roicians.com/");
			
driver.findElement(By.id("text-77525447616")).sendKeys("Roicians");
driver.findElement(By.id("text-95374915097")).sendKeys("Tech");
driver.findElement(By.id("field-U7H2lPxWxSPqWeq")).sendKeys("C:\\Users\\subbu\\OneDrive\\Documents\\Testing");
		

	}

}
