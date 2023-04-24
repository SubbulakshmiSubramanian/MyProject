package SEL;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver=new ChromeDriver(op);
		
		driver.get("https://www.roicians.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(srcfile,new File("C:\\Users\\subbu\\OneDrive\\Documents\\Webbbased\\screenshots\\screenshot.jpg"));
		}

}
