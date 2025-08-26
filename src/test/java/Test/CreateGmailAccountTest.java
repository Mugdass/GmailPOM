package Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.ExcelReader;

public class CreateGmailAccountTest extends BaseTest2{

	
	
	
	@Test(dataProvider="gm")
	public void creategmailaccounttest(String first, String last, String usern, String p, String cp, String nr) throws InterruptedException {
		
		
		
		getCreateGmailAccountPage();
		creategmailaccountpage.typeFirstName(first);
		creategmailaccountpage.typeLastName(last);
		creategmailaccountpage.typeUsername(usern);
		creategmailaccountpage.typePassword(p);
		creategmailaccountpage.typeConfirmPassword(cp);
		creategmailaccountpage.typeShowPassword();
		creategmailaccountpage.typeClickNext();
		
		
		
		
		
		getEnterPhoneNumberPage();
		
		enterphonenumberpage.typePhoneNumber(nr);
		enterphonenumberpage.typeClickNext();
		
		
		
		
		getVerifyPhoneNumberPage();
		
	
		String actual = verifyphonenumberpage.getPhoneNumber();
		Assert.assertEquals(actual, nr);
		
		
		
		/*
		
		String verificationNumberElement = driver.findElement(By.xpath("//span[@jsname='wKtwcc']")).getText();
		//WebElement givenNumberElement = driver.findElement(By.xpath("//input[@aria-labelledby='c9']"));
		String l = nr;
		
		
			
			//Assert.assertEquals(l,givenNumberElement.getText());
			Assert.assertEquals(l, verificationNumberElement);
		
		
		
		
		
		//Assert.assertEquals(nr,"951-478-4218");
		
		
		*/
		
		
		
	}
	
	@DataProvider(name="gm")
	public Object[][] dataloader() throws IOException {
		Object[][] t;
		
		String filename = "data/FirstList.xlsx";
		String sheetname = "Sheet1";
		ExcelReader er = new ExcelReader(filename, sheetname);
		t = er.excelToArray();
		return t;
		
		
		}
		
		
		
	

}
	
	
	
	
	
	
	

