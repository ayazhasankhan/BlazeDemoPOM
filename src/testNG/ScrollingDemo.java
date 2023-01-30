package testNG;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScrollingDemo extends BaseClass {


	

	
	@BeforeTest // anotations
	public void setUp() {
		
		File file = new File("/Users/mr.a2z/Ayazworkspace/SDETBatch007/jar/chromedriver");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		ChromeOptions ops = new ChromeOptions();
		ops.setHeadless(false);
		driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		
	}
	@Test
	public void actualTest() throws Exception {
		
		driver.get("https://www.browserstack.com/users/sign_in?");
		
		BaseClass.takeScreenshot("HomePage.png");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		js.executeScript("document.getElementById(\"user_email_login\").value='test@test.com';");
		
		BaseClass.takeScreenshot("BottomPage.png");
	}
	@AfterTest
	public void tearDown() {
		
	//	driver.close();
	}  


}
