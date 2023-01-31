package testNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HeadlessBrowerDemo {


	
public static WebDriver driver;
	
	@BeforeTest // anotations
	public void setUp() {
		

		//driver = new HtmlUnitDriver(); headless browser
		driver.manage().window().maximize();
		
	}
	@Test
	public void actualTest() throws Exception {
		
		driver.get("https://the-internet.herokuapp.com/");
		
		System.out.println(driver.getTitle());

	}
	@AfterTest
	public void tearDown() {
		
	//	driver.close();
	}  


}
