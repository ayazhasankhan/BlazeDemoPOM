package testNG;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TakeScreenshotDemo {


	
public static WebDriver driver;
	
	@BeforeTest // anotations
	public void setUp() {
		
		File file = new File("/Users/mr.a2z/Ayazworkspace/SDETBatch007/jar/chromedriver");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		ChromeOptions ops = new ChromeOptions();
		ops.setHeadless(true);
		driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		
	}
	@Test
	public void actualTest() throws Exception {
		
		driver.get("https://www.w3schools.com/java/java_type_casting.asp");
		System.out.println(driver.getTitle());
		
		// typecast driver to access TakesScreenshot method
		TakesScreenshot screen = (TakesScreenshot)driver;
		
		// take the screenshot as output type file
		File file = screen.getScreenshotAs(OutputType.FILE);
		
		// save the screenshot taken in destination path
		FileUtils.copyFile(file, new File("/Users/mr.a2z/Ayazworkspace/SDETBatch007/ScreenShots/java_type_casting.png"));

	}
	@AfterTest
	public void tearDown() {
		
	//	driver.close();
	}  


}
