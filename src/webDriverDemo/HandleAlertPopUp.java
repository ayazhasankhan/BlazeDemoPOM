package webDriverDemo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleAlertPopUp {
public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("/Users/mr.a2z/Ayazworkspace/SDETBatch007/jar/geckodriver");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
       // driver.switchTo().alert().dismiss();

	}

}

