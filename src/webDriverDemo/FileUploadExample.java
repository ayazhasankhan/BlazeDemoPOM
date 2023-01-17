package webDriverDemo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

    public class FileUploadExample {

    public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("/Users/mr.a2z/Ayazworkspace/SDETBatch007/jar/geckodriver");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("/Users/mr.a2z/Ayazworkspace/SDETBatch007/jar/TestData.txt");


	}

}
