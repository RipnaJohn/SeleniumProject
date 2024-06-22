package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	
      WebDriver driver;
	
	public LoginPage(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver,this);	
		
	}




	@FindBy(className = "signup-name")
	private WebElement supName;
	
	@FindBy(className = "signup-username")
	private WebElement supUName;
	
	@FindBy(className = "signup-password")
	private WebElement supPassword;

	@FindBy(className = "signup-email")
	private WebElement supEmail;
	
	@FindBy(className = "signup-number")
	private WebElement supNumber;
	
	@FindBy(className = "signup-btn")
	private WebElement supButton;
	
	@FindBy(className = "login-link")
	private WebElement loginLink;
	
	@FindBy(xpath = "//input[@class='login-username']")
	private WebElement loginUserName;
	
	@FindBy(className = "login-password")
	private WebElement loginPassword;
	
	@FindBy(className = "login-btn")
	private WebElement loginButton;
	
	
	
	public WebElement getSupName() {
		return supName;
	}

	public WebElement getSupUName() {
		return supUName;
	}

	public WebElement getSupPassword() {
		return supPassword;
	}

	public WebElement getSupEmail() {
		return supEmail;
	}

	public WebElement getSupNumber() {
		return supNumber;
	}

	public WebElement getSupButton() {
		return supButton;
	}
	
    public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getLoginUserName() {
		return loginUserName;
	}

	public WebElement getLoginPassword() {
		return loginPassword;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void Registeruser(String Name,String UserName,String Password,String Email,String Number) throws InterruptedException {
		
		
    	supName.sendKeys(Name);
    	supUName.sendKeys(UserName);
    	supPassword.sendKeys(Password);
    	supEmail.sendKeys(Email);
    	supNumber.sendKeys(Number);
    	supButton.click();
    	Thread.sleep(2000);
    	driver.switchTo().alert().accept();
    	
    	
    	
	}
	
	
	public void loginUser(String UserName,String Password) throws InterruptedException {
		
		loginLink.click();
    	
		loginUserName.sendKeys(UserName);
    	loginPassword.sendKeys(Password);
    	loginButton.click();
        Thread.sleep(2000);
    	driver.switchTo().alert().accept();
	}
	
}


