package testNGXMLExample;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebDriverWaitDemo extends LaunchCloseBrowser{
	
	/*
	 * Wait in Selenium: 
	 * 
	 * 1. Implicit wait: applied on the webdriver-- when ever driver will interarct on webelement it will wait
	 * 2. explicit wait: we can apply the load on the element level
	 * 3. Fluent wait: its extention of explicit
	 * 
	 * 
	 */

	@Test
	public void actualTest() throws Exception {
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //implicit wait
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
	    driver.findElement(By.xpath("//button[normalize-space()='Start']")).click();
	
		WebDriverWait wait1 =new WebDriverWait(driver, Duration.ofSeconds(30));
		wait1.pollingEvery(Duration.ofSeconds(1));
		wait1.ignoring(NoSuchElementException.class);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"finish\"]/h4")));
		
		String text =driver.findElement(By.xpath("//*[@id=\"finish\"]/h4")).getText();
		Assert.assertEquals(text, "Hello World!");
		
		System.out.println(text);
		Reporter.log(text);		
	}
}
