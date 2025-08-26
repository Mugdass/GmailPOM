package Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class CreateGmailAccountModel extends BaseModel2{

	public CreateGmailAccountModel(WebDriver driver) {
		super(driver);
		
		

	}
	

	
	
	public WebElement getFirstName() {
		
		WebElement firstname = driver.findElement(By.xpath("//input[@id='firstName']"));
		
		return firstname;
		
	}
	
	
public WebElement getLastName() {
		
	WebElement lastname = driver.findElement(By.xpath("//input[@id='lastName']"));
		
		return lastname;
		
	}


public WebElement getUsername() {
	
	WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
	
	return username;
	
}


public WebElement getPassword() {
	
	WebElement pass = driver.findElement(By.xpath("//input[@name='Passwd']"));
	
	return pass;
	
}


public WebElement getConfirmPassword() {
	
	WebElement cpass = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
	
	return cpass;
	
}


public WebElement getShowPassword() {
	
	WebElement showP = driver.findElement(By.xpath("//div[@id='selectioni1']"));
	
	return showP;
	
}





public WebElement getClickNext() {
	
	WebElement but = driver.findElement(By.xpath("//span[text()='Next']"));
	
	return but;
	
}




	
	
	
	
	
	
	
	

}
