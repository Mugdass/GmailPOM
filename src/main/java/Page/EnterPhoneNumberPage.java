package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import Model.EnterPhoneNumberModel;


public class EnterPhoneNumberPage extends EnterPhoneNumberModel{

	public EnterPhoneNumberPage(WebDriver driver) {
		super(driver);
		

	}
	
	
	


public void typePhoneNumber(String nr) throws InterruptedException {
	
	//WebElement number2 = getPhoneNumber();
	
	//number2.clear();
	//Thread.sleep(1750);
	//number2.sendKeys(nr);
	
	
	
	
	WebDriverWait t = new WebDriverWait(driver, 10); 


	By locator = By.xpath("//input[@class='VfPpkd-fmcmS-wGMbrd ']");

	WebElement number2 = getPhoneNumber();

	t.until(ExpectedConditions.presenceOfElementLocated(locator));
	t.until(ExpectedConditions.elementToBeClickable(number2));
			
			
			
			//Thread.sleep(1750);
	
	number2.sendKeys(nr);
	//Thread.sleep(1750);
	
	
}




public void typeClickNext() throws InterruptedException {
	
	
	WebDriverWait t = new WebDriverWait(driver, 10); 


	By locator = By.xpath("//span[text()='Next']");

	WebElement but = getClickNext();

	t.until(ExpectedConditions.presenceOfElementLocated(locator));
	t.until(ExpectedConditions.elementToBeClickable(but));
			
			
			
			//Thread.sleep(1750);
	but.click();
	//Thread.sleep(1750);
	
	
}


	
	
	
	
	
	
	
	

}
