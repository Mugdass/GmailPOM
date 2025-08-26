package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Page.CreateGmailAccountPage;
import Page.EnterPhoneNumberPage;
import Page.VerifyPhoneNumberPage;




public class BaseTest2 {
	static WebDriver driver;
	
	static CreateGmailAccountPage creategmailaccountpage;
	
	
	
	static EnterPhoneNumberPage enterphonenumberpage;
	
	static VerifyPhoneNumberPage verifyphonenumberpage;
	
	
	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/matas/Downloads/chromedriver");
		
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		
		driver.get("https://accounts.google.com/signup");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	
	public void getCreateGmailAccountPage() {
		creategmailaccountpage = new CreateGmailAccountPage(driver);
		
	}
	

	
	

	public void getEnterPhoneNumberPage() {
		enterphonenumberpage = new EnterPhoneNumberPage(driver);
		
	}
	
	
	
	public void getVerifyPhoneNumberPage() {
		verifyphonenumberpage = new VerifyPhoneNumberPage(driver);
		
	}
	
	
	
	
	
	
	
	@AfterSuite
	public void quitDriver() throws InterruptedException {
		
	
		Thread.sleep(4000);
		//driver.quit();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
