 package LoginTest;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.Screenshot;
import generics.BaseTest;

public class LoginuserTest extends BaseTest {
	
	LoginPage lp;
	HomePage hp;
	
	Properties pr;

	WebDriverWait wait;
	
	
	
	@Test (priority = -1)
	public void logintest() throws InterruptedException, IOException {
		
		test = report.startTest("BewakoofTest");

		pr = new Properties();
		
		lp = new LoginPage(driver);		
		
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
        test.log(LogStatus.PASS, "Waiting for title to contain 'Document'");// this will log the message in your report
		 System.out.println("title contain 'Document' successfully");
		wait.until(ExpectedConditions.titleContains("Document"));
		
		test.log(LogStatus.INFO, "Registering user");
		lp.Registeruser(uname, name, pass, email, number);
		
		Screenshot screenshots = new Screenshot(driver);
		screenshots.capture(1);
		test.log(LogStatus.INFO, "Captured screenshot 1");
		driver.navigate().refresh();
		screenshots.capture(2);
		 test.log(LogStatus.INFO, "Captured screenshot 2");
		lp.loginUser(name, pass);
	
		test.log(LogStatus.PASS, "User logged in successfully");
     
	}
	
	
	@Test (priority = 0)
	public void Homeuser() throws InterruptedException, IOException {
		
		
		pr = new Properties();
		hp = new HomePage(driver);
		
		 test.log(LogStatus.INFO, "Performing home user actions");
		 
		hp.Homeuser(fname,mnumber,zcode,cname,sname,flname,lname,lmname);
		Screenshot screenshots = new Screenshot(driver);
		screenshots.capture(3);
		
		test.log(LogStatus.INFO, "Captured screenshot 3");

        test.log(LogStatus.PASS, "Homeuser actions completed successfully");

        report.endTest(test);
		//hp.getClkWshList().click();
		//driver.navigate().refresh();
		//hp.getClkAddBag().click();
		
        report.endTest(test);
		
		
		
	}

}
