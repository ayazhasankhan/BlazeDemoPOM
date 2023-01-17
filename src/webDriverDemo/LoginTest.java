package webDriverDemo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		File file = new File("/Users/mr.a2z/Ayazworkspace/SDETBatch007/jar/geckodriver");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		
		/*
		 for chrome
		 1. give the path 
		 2. webdriver.chrome.driver
		 3. driver = new ChromeDriver();
		 */
		
		/*
		 for Firefox
		 1. give the path 
		 2. webdriver.gecko.driver
		 3. driver = new FirefoxDriver();
		 */
		
		
		/*
		 for Edge
		 1. give the path 
		 2. webdriver.edge.driver
		 3. driver = new EdgeDriver();
		 */
		
		driver = new FirefoxDriver(); // open firefox
		driver.manage().window().maximize(); // maximize firefox
		driver.get("https://blazedemo.com/login"); // open url
		driver.findElement(By.id("email")).sendKeys("ayaz@gmail.com");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.name("remember")).click();	
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		
	}

}
