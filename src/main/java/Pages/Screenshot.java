package Pages;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

     static WebDriver driver;
     
     public Screenshot(WebDriver driver) {
    	 
    	 this.driver = driver;
    	 
     }
	
	public static void capture(int number) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File file1 =ts.getScreenshotAs(OutputType.FILE);
		
		File file2 = new File("C:\\Users\\joshi\\OneDrive\\Documents\\Screenshot selenium1\\"+number+".png");
		 
		 FileUtils.copyFile(file1, file2);
		 
	}
	
	

}
