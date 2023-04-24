package SEL;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Elements {

	public static void main(String[] args) {
		//Step1 open the browser
				System.setProperty("webdriver.chrome.driver","chromedriver.exe");
				ChromeOptions op=new ChromeOptions();
				op.addArguments("--remote-allow-origins=*");
		//Step2 Type url
				ChromeDriver driver=new ChromeDriver(op);
				driver.get("https://www.roicians.com/career/");
				Select obj=new Select(driver.findElement(By.id("field-jHhehcNamzHL47m")));
				//obj.selectByVisibleText("Automation Testing Trainer");
				//obj.selectByValue("Automation Testing Trainer");
				obj.selectByIndex(3);
				
				}

}
