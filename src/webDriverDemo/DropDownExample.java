package webDriverDemo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("/Users/mr.a2z/Ayazworkspace/SDETBatch007/jar/geckodriver");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://blazedemo.com/");
		/*
		 For dropdown we have to use a class called "Select".
		 
		 We can select the dopdown in 3 ways: 
		 1. Select by index
		 2. Select by value
		 3. Select by visual Text
		 */
		
		//new Select(driver.findElement(By.name("fromPort"))).selectByValue("Mexico City");
		
		new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("San Diego");
		
		
		Thread.sleep(10000);
		driver.close();
		
	}

}
