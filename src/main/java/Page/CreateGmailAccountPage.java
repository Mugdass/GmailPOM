package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Model.CreateGmailAccountModel;

public class CreateGmailAccountPage extends CreateGmailAccountModel{

	public CreateGmailAccountPage(WebDriver driver) {
		super(driver);
		

	}
	
	
	
	
public void typeFirstName(String first) throws InterruptedException {
	
	WebElement firstname = getFirstName();
		
	Thread.sleep(800);
	firstname.clear();
	Thread.sleep(800);
	firstname.sendKeys(first);
	
		
		
		
		
	}
	
	
public void typeLastName(String last) throws InterruptedException {
		
	WebElement lastname = getLastName();
		

	lastname.clear();
	Thread.sleep(800);
	lastname.sendKeys(last);
		
		
	}


public void typeUsername(String usern) throws InterruptedException {
	
	WebElement username = getUsername();
	
	
	username.clear();
	Thread.sleep(800);
	username.sendKeys(usern);
	
	
	
}


public void typePassword(String p) throws InterruptedException {
	
	
WebElement pass = getPassword();
	
	
	pass.clear();
	Thread.sleep(800);
	pass.sendKeys(p);
	
	
	
	
}


public void typeConfirmPassword(String cp) throws InterruptedException {
	
WebElement cpass = getConfirmPassword();
	
	
	cpass.clear();
	Thread.sleep(800);
	cpass.sendKeys(cp);
	
}


public void typeShowPassword() throws InterruptedException {
	
WebElement showP = getShowPassword();
	
Thread.sleep(800);
	showP.click();
	Thread.sleep(800);
}







public void typeClickNext() throws InterruptedException {
	
	
	WebDriverWait t = new WebDriverWait(driver, 10); 


	By locator = By.xpath("//span[text()='Next']");

	WebElement but = getClickNext();

	t.until(ExpectedConditions.presenceOfElementLocated(locator));
	t.until(ExpectedConditions.elementToBeClickable(but));
			
			
			
			Thread.sleep(3000);
	but.click();
	Thread.sleep(1750);
	
	
}



	
	
	
	
	
	
	
	

}
