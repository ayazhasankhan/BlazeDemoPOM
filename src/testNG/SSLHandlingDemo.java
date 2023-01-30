package testNG;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SSLHandlingDemo {


	
public static WebDriver driver;
	
	@BeforeTest // anotations
	public void setUp() {
		
		File file = new File("/Users/mr.a2z/Ayazworkspace/SDETBatch007/jar/chromedriver");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		ChromeOptions ops = new ChromeOptions();
		ops.setAcceptInsecureCerts(true);
		driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		
	}
	@Test
	public void actualTest() throws Exception {
		
		driver.get("https://expired.badssl.com/");
		
		System.out.println(driver.getTitle());

	}
	@AfterTest
	public void tearDown() {
		
	//	driver.close();
	}  


}
