package testNG;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExample {
	
	public static WebDriver driver;
	
	@BeforeMethod // anotations
	public void setUp() {
		
		File file = new File("/Users/mr.a2z/Ayazworkspace/SDETBatch007/jar/geckodriver");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	@Test(priority =2)
	public void atTest1() {	
		driver.get("https://blazedemo.com/");
	}
	
	@Test(priority =3)
	public void atTest2() {	
		driver.get("https://the-internet.herokuapp.com/");
	}
	
	@Test(priority =1)
	public void atTest3() {	
		driver.get("https://www.saucedemo.com/");
	}
	
	@AfterMethod
	public void tearDown() {
		
		//driver.close();
	} 	

}
