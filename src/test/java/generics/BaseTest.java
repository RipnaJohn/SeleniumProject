package generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseTest {
	
	protected WebDriver driver;
	protected String name;
	protected String uname;
	protected String pass;
	protected String email;
	protected String number;
	protected String fname;
	protected String mnumber;
	protected String zcode;
	protected String cname;
	protected String sname;
	protected String flname;
	protected String lname;
	protected String lmname;
	protected ExtentReports report;
	protected ExtentTest test;
    
	
	
	@BeforeClass
	public void setup() throws IOException {
		
		driver = new ChromeDriver();
		
		
		Properties pr = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\joshi\\OneDrive\\Desktop\\selinium\\Bewakoof\\src\\test\\resources\\config.properties");
		
		pr.load(fis);
		
		String url = pr.getProperty("url");

		 name =pr.getProperty("Name");
		 uname =pr.getProperty("UserName");
		 pass =pr.getProperty("Password");
		 email =pr.getProperty("Email");
		 number =pr.getProperty("Number");
		 fname =pr.getProperty("firstName");
		 mnumber =pr.getProperty("mobileNumber");
		 zcode =pr.getProperty("zipCode");
		 cname =pr.getProperty("cityName");
		 sname =pr.getProperty("stateName");
		 flname =pr.getProperty("flatNumber");
		 lname =pr.getProperty("localityName");
		 lmname =pr.getProperty("landMark");
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		 report = new ExtentReports("C:\\Users\\joshi\\OneDrive\\Documents\\Selenium Report1\\newrprojecteport1.html");
	}
	
	
	@AfterClass
	public void teardown() {
			
		//report.close();
		driver.quit();  
		report.flush();
        
		
	}



}
