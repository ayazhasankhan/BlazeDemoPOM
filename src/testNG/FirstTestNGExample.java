package testNG;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNGExample {
	
	public static WebDriver driver;
	
	@BeforeTest // anotations
	public void setUp() {
		
		File file = new File("/Users/mr.a2z/Ayazworkspace/SDETBatch007/jar/geckodriver");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void actualTest() {
		
		driver.get("https://blazedemo.com/");
		new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("San Diego");
	}
	
	
	@AfterTest
	public void tearDown() {
		
		driver.close();
	}

}
