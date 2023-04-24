package SEL;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testnew {
	
//step1 system.setproperty(location of driver)
//step2 Get url
//step3 perform action on particular element
//step4 close browser
	
//STLC Write test cases,execute test cases,we log defect

@BeforeSuite
public void beforesuite()
{
	System.out.println("Before Suite");
}
@BeforeTest
public void beforetest()
{
	System.out.println("Before test");
}
@BeforeClass
public void beforeclass()
{
	System.out.println("Before class");
}
@BeforeMethod 
public void beforemethod()
{
	System.out.println("Before method");
}

	
@Test(priority=1)
public void writetestcases()
{
	System.out.println("First write testcases");
}
@Test(priority=2)
public void Executetestcases()
{
	System.out.println("Then execute test cases");
}
@Test(priority=3)
public void Defect()
{
	System.out.println("Log Defect");
}

}
