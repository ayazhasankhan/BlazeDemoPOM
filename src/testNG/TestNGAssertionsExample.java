package testNG;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAssertionsExample {

public static WebDriver driver;

	
	@BeforeTest // anotations
	public void setUp() {
		
		File file = new File("/Users/mr.a2z/Ayazworkspace/SDETBatch007/jar/chromedriver");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver =new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void actualTest() {
		
		driver.get("https://the-internet.herokuapp.com/notification_message_rendered");
		
		String s =driver.findElement(By.xpath("//a[@href=\"/notification_message\"]")).getText();
		
		System.out.println(s);
		
		Assert.assertEquals(s, "Click here");
		
		
	}
	
	@AfterTest
	public void tearDown() {
		
		//driver.close();
	}  

}
