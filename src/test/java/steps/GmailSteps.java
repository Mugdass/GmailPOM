package steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Page.CreateGmailAccountPage;
import Page.EnterPhoneNumberPage;
import Page.VerifyPhoneNumberPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GmailSteps {
	
WebDriver driver = StepBase.driver;


CreateGmailAccountPage creategmailaccountpage = new CreateGmailAccountPage(driver);



EnterPhoneNumberPage enterphonenumberpage = new EnterPhoneNumberPage(driver);

VerifyPhoneNumberPage verifyphonenumberpage = new VerifyPhoneNumberPage(driver);


@Given("I am on the Gmail Account page {string}")
public void i_am_on_the_gmail_account_page(String URL) {
    

	driver.navigate().to(URL);
}

@When("I type First Name {string}")
public void i_type_first_name(String first) throws InterruptedException {
    

	creategmailaccountpage.typeFirstName(first);
	
}

@When("I type Last Name {string}")
public void i_type_last_name(String last) throws InterruptedException {

	creategmailaccountpage.typeLastName(last);
}

@When("I type Username {string}")
public void i_type_username(String usern) throws InterruptedException {
    
	creategmailaccountpage.typeUsername(usern);
}

@When("I type Password {string}")
public void i_type_password(String p) throws InterruptedException {
    
	creategmailaccountpage.typePassword(p);
}

@When("I type Confirm Password {string}")
public void i_type_confirm_password(String cp) throws InterruptedException {
   
	creategmailaccountpage.typeConfirmPassword(cp);
}

@When("I click Show Password")
public void i_click_show_password() throws InterruptedException {
   
	creategmailaccountpage.typeShowPassword();
}

@When("I click Next")
public void i_click_next() throws InterruptedException {
 
	creategmailaccountpage.typeClickNext();
}

@When("I type Phone Number {string}")
public void i_type_phone_number(String nr) throws InterruptedException {
    
	enterphonenumberpage.typePhoneNumber(nr);
}



@When("I again click Next")
public void i_again_click_next() throws InterruptedException {
 
	creategmailaccountpage.typeClickNext();
}

@Then("get Phone Number and verify it {string}")
public void get_phone_number_and_verify_it(String nr) throws InterruptedException {
    
	String actual = verifyphonenumberpage.getPhoneNumber();
	Assert.assertEquals(actual, nr);
}
















	
}

	