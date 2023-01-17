package webDriverDemo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseHoverExample {
public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("/Users/mr.a2z/Ayazworkspace/SDETBatch007/jar/geckodriver");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		//driver.get("https://the-internet.herokuapp.com/hovers"); // url open
		
		driver.navigate().to("https://the-internet.herokuapp.com/hovers");
		driver.navigate().refresh();
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[@class='example']//div[1]//img[1]")));
		act.build().perform();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='example']//div[1]//div[1]//a[1]")).click();


	}

}

