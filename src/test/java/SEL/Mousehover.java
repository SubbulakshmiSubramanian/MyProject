package SEL;

//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;


public class Mousehover {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		FirefoxOptions op=new FirefoxOptions();
		op.setBinary("C:\\Program Files\\Mozilla Firefox/firefox.exe");
//		op.addArguments("--remote-allow-origins=*");
		FirefoxDriver driver=new FirefoxDriver(op);
		
		driver.get("https://www.roicians.com/");
		
		
		//Actions
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Courses"))).build().perform();//to implement actions required
		driver.findElement(By.partialLinkText("SOFTWARE T")).click();
		driver.close();
		driver.quit();

	}

}
