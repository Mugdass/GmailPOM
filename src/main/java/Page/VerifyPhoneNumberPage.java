package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Model.VerifyPhoneNumberModel;


public class VerifyPhoneNumberPage extends VerifyPhoneNumberModel{

	public VerifyPhoneNumberPage(WebDriver driver) {
		super(driver);
		

	}
	
	
	


public String getPhoneNumber() throws InterruptedException {
	
	String verificationNumberElement = getVerifyPhoneNumber().getText();
	//WebElement givenNumberElement = driver.findElement(By.xpath("//input[@aria-labelledby='c9']"));
	//String l = nr;
	
	
		
		//Assert.assertEquals(l,givenNumberElement.getText());
		//Assert.assertEquals(l, verificationNumberElement);
	
	return verificationNumberElement;
	
	//System.out.println("\n The given number: "+l + "\n\n matches the verification number: " + verificationNumberElement+
			//"\n\n Both Numbers are the same.\n");
	//System.out.println("\n\n Result:	\n\n");
	
	
}
	
	
	
	//Thread.sleep(1750);
	
	
}






	
	
	
	
	
	
	
	


