package Test;

import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Model.VerifyPhoneNumberModel;


public class VerifyPhoneNumberPage extends VerifyPhoneNumberModel{

	public VerifyPhoneNumberPage(WebDriver driver) {
		super(driver);
		

	}
	
	
	


public void typeVerifyPhoneNumber(String nr) throws InterruptedException {
	
	String verificationNumberElement = driver.findElement(By.xpath("//span[@jsname='wKtwcc']")).getText();
	//WebElement givenNumberElement = driver.findElement(By.xpath("//input[@aria-labelledby='c9']"));
	String l = nr;
	
	
		
		//Assert.assertEquals(l,givenNumberElement.getText());
	
		AssertJUnit.assertEquals(l, verificationNumberElement);
	
	
	
}
	
	
	
	//Thread.sleep(1750);
	
	
}






	
	
	
	
	
	
	
	


