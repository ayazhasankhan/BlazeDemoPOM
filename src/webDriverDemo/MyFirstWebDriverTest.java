package webDriverDemo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstWebDriverTest {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		File file = new File("/Users/mr.a2z/Ayazworkspace/SDETBatch007/jar/chromedriver");
		
		// File file = new File("//Users//mr.a2z//Ayazworkspace//SDETBatch007//jar//chromedriver.exe"); for windows user
		
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		driver =new ChromeDriver();
		
		driver.manage().window().maximize(); // to maximize the Chrome browser
		
		driver.get("https://the-internet.herokuapp.com/login"); // open url
		
		
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
	
	}

}
