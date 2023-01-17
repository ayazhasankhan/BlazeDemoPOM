package webDriverDemo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ValidateTextExample {

	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("/Users/mr.a2z/Ayazworkspace/SDETBatch007/jar/geckodriver");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://blazedemo.com/");

		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		Thread.sleep(5000);
		
		String expectedAirLineName= driver.findElement(By.xpath("//td[normalize-space()='Lufthansa']")).getText();
		
		System.out.println(expectedAirLineName);
		
		driver.findElement(By.xpath("//tbody/tr[5]/td[1]/input[1]")).click();
		Thread.sleep(5000);
		String actualAirLineName = driver.findElement(By.xpath("//p[normalize-space()='Airline: United']")).getText();
		
		System.out.println(actualAirLineName);
		
		
		Thread.sleep(10000);
		driver.close();
		
	}

}
