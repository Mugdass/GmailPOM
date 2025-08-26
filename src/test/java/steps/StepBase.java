package steps;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Page.CreateGmailAccountPage;
import Page.EnterPhoneNumberPage;
import Page.VerifyPhoneNumberPage;




public class StepBase {

	static WebDriver driver;
	
 CreateGmailAccountPage creategmailaccountpage;
	
	
	
	 EnterPhoneNumberPage enterphonenumberpage;
	
	 VerifyPhoneNumberPage verifyphonenumberpage;
	
	

	
	@io.cucumber.java.Before
	public void before() {
		
System.setProperty("webdriver.chrome.driver", "/Users/matas/Downloads/chromedriver");
		
ChromeOptions handleNotifications = new ChromeOptions();

handleNotifications.addArguments("--disable-notifications");

driver = new ChromeDriver(handleNotifications);
		
	    driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   
	    	    
	        }
	       
	
	


	@io.cucumber.java.After
	public void after() throws InterruptedException {
		
		Thread.sleep(7000);
	   driver.quit();
	}
	
	
	
	
	
	
	
	
}