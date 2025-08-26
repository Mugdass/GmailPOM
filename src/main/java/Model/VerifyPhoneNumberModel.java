package Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class VerifyPhoneNumberModel extends BaseModel2{

	public VerifyPhoneNumberModel(WebDriver driver) {
		super(driver);
		
		

	}
	

	
	
	public WebElement getVerifyPhoneNumber() throws InterruptedException {
		
		Thread.sleep(2000);
		
		WebElement verificationNumberElement = driver.findElement(By.xpath("//div[contains(text(),'6-digit verification code')]/following-sibling::span/descendant::span"));
		//WebElement givenNumberElement = driver.findElement(By.xpath("//input[@aria-labelledby='c9']"));
		
		
		
		
//WebElement number2 = driver.findElement(By.xpath("//input[@class='VfPpkd-fmcmS-wGMbrd ']"));
		
		
		
	
		return verificationNumberElement;
		
	}
	
	

	


	
	
	
	
	
	
	
	

}
