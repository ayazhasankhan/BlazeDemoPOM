package testNG;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IFrameHandlingExample {


	
public static WebDriver driver;
	
	@BeforeTest // anotations
	public void setUp() {
		
		File file = new File("/Users/mr.a2z/Ayazworkspace/SDETBatch007/jar/geckodriver");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void actualTest() throws Exception {
		
		driver.get("https://demoqa.com/frames");
		
		driver.switchTo().frame("frame1");
		String s =driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(s);
		
		driver.switchTo().defaultContent(); // go out of the iframe
	}
	@AfterTest
	public void tearDown() {
		
	//	driver.close();
	}  


}
