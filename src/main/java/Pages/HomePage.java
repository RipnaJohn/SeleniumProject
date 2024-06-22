package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	  WebDriver driver;
		
		public HomePage(WebDriver driver){
			
			this.driver = driver;
			PageFactory.initElements(driver,this);	
			
		}
		
		@FindBy(xpath = "//div/span[contains(text(),'WOMEN')]")
		private WebElement Womenbutton;
		
		@FindBy(xpath = "(//div[@class='content_div'])[2]")
		private WebElement secondContainer;
		
		
		@FindBy(xpath = "//span[@class='pd-wishlist-text']")
		private WebElement WishlistButton;
		
//		@FindBy(xpath = "//button[@class='pd-add-to-bag-btn']")
//		private WebElement AddCartBtn;
		
		@FindBy(xpath = "//a[@href='/html/wishlist']")
		private WebElement ClkWshList;
		
		@FindBy(xpath = "//button[@class='add-to-cart']")
		private WebElement ClkAddBag;
		
		@FindBy(xpath = "//img[@src='../image/bag.svg']")
		private WebElement ClkBagIcon;

		@FindBy(xpath = "(//button[@class='add-address'])[1]")
		private WebElement AddAddress;
		
		@FindBy(xpath = "//input[@class='form-name']")
		private WebElement FirstName;
		
		@FindBy(xpath = "//input[@class='form-mobile']")
		private WebElement MobileNumber;
		
		@FindBy(xpath = "//input[@class='form-zip']")
		private WebElement ZipCode;
		
		@FindBy(xpath = "//input[@class='form-city']")
		private WebElement CityName;
		
		@FindBy(xpath = "//input[@class='form-state']")
		private WebElement StateName;
		
		@FindBy(xpath = "//input[@class='form-flatno']")
		private WebElement FlatNumber;
		
		@FindBy(xpath = "//input[@class='form-locality']")
		private WebElement LocalityName;
		
		@FindBy(xpath = "//input[@placeholder='Landmark(optional)']")
		private WebElement LandmarkName;
		
		@FindBy(xpath = "//button[@class='place-order']")
		private WebElement PlaceOrderBtn;
		
		public WebElement getWomenbutton() {
			return Womenbutton;
		}

        
		public WebElement getSecondContainer() {
			return secondContainer;
		}

		public WebElement getWishlistButton() {
			return WishlistButton;
		}
		
		public WebElement getClkWshList() {
			return ClkWshList;
		}


		public WebElement getClkAddBag() {
			return ClkAddBag;
		}


		public WebElement getClkBagIcon() {
			return ClkBagIcon;
		}


		public WebElement getAddAddress() {
			return AddAddress;
		}


		public WebElement getFirstName() {
			return FirstName;
		}


		public WebElement getMobileNumber() {
			return MobileNumber;
		}


		public WebElement getZipCode() {
			return ZipCode;
		}


		public WebElement getCityName() {
			return CityName;
		}


		public WebElement getStateName() {
			return StateName;
		}


		public WebElement getFlatNumber() {
			return FlatNumber;
		}


		public WebElement getLocalityName() {
			return LocalityName;
		}


		public WebElement getLandmarkName() {
			return LandmarkName;
		}


		public WebElement getPlaceOrderBtn() {
			return PlaceOrderBtn;
		}


		public void Homeuser(String firstName,String mobileNumber,String zipCode,String cityName,String stateName,String flatNumber,String localityName,String landMark) throws InterruptedException {
			
			Womenbutton.click();
			secondContainer.click();
			Thread.sleep(2000);
			WishlistButton.click();
			Thread.sleep(2000);
			ClkWshList.click();
			Thread.sleep(2000);
			ClkAddBag.click();
			ClkBagIcon.click();
			AddAddress.click();
			FirstName.sendKeys(firstName);
			MobileNumber.sendKeys(mobileNumber);
			ZipCode.sendKeys(zipCode);
			CityName.sendKeys(cityName);
			StateName.sendKeys(stateName);
			FlatNumber.sendKeys(flatNumber);
			LocalityName.sendKeys(localityName);
			LandmarkName.sendKeys(landMark);
			PlaceOrderBtn.click();
			Thread.sleep(2000);
	    	driver.switchTo().alert().accept();
			
		}


		


		

}
