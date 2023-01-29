package testNGXMLExample;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Yahoo extends LaunchCloseBrowser{

	@Test
	public void actualTest() {
		
		driver.get("https://www.yahoo.com/");
		
	}

}
