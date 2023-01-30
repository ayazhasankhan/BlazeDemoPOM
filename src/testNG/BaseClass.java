package testNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void takeScreenshot(String fileName) throws Exception {
		
		TakesScreenshot screen = (TakesScreenshot)driver;
		// take the screenshot as output type file
		File file = screen.getScreenshotAs(OutputType.FILE);
		// save the screenshot taken in destination path
		String filePath ="/Users/mr.a2z/Ayazworkspace/SDETBatch007/ScreenShots/";
		String CompleteFile =filePath+fileName;
		FileUtils.copyFile(file, new File(CompleteFile));
	}
}
