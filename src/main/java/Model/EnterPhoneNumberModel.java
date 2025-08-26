package Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class EnterPhoneNumberModel extends BaseModel2{

	public EnterPhoneNumberModel(WebDriver driver) {
		super(driver);
		
		

	}
	

	
	
	public WebElement getPhoneNumber() {
		
		WebElement number2 = driver.findElement(By.xpath("//input[@class='VfPpkd-fmcmS-wGMbrd ']"));
		
		return number2;
		
	}
	
	

	public WebElement getClickNext() {
		
		WebElement but = driver.findElement(By.xpath("//span[text()='Next']"));
		
		return but;
		
	}

	
	
	
	
	
	
	
	

}
