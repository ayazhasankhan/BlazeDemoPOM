package testNG;

import java.io.File;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleCookieDemo {


	
public static WebDriver driver;
	
	@BeforeTest // anotations
	public void setUp() {
		
		File file = new File("/Users/mr.a2z/Ayazworkspace/SDETBatch007/jar/chromedriver");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		ChromeOptions ops = new ChromeOptions();
		ops.setHeadless(false);
		driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		
	}
	@Test
	public void actualTest() throws Exception {
		
		driver.get("https://www.lambdatest.com/");
		
		System.out.println(driver.getTitle());
		
        Cookie cname = new Cookie("myCookie", "Ayaz123@3832");
        driver.manage().addCookie(cname);

        Set<Cookie> cookiesList =  driver.manage().getCookies();
        for(Cookie getcookies :cookiesList) {
            System.out.println(getcookies );
        }
	}
	@AfterTest
	public void tearDown() {
		
	//	driver.close();
	}  


}
