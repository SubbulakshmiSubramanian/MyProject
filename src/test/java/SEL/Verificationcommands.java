package SEL;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Verificationcommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(op);
		driver.get("https://www.google.com/");
//boolean result= driver.findElement(By.linkText("Gmail")).isDisplayed();
boolean result= driver.findElement(By.cssSelector(".gb_f")).isEnabled();

System.out.println(result);

	}

}
