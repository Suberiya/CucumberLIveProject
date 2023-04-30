package stepdefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import factory.DriverFactory;

import static org.junit.Assert.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;

public class Login {
	WebDriver driver;
	private LoginPage loginpage;
	
	@Given("User has navigated to login Page")
	public void user_has_navigated_to_login_page() {
		driver=DriverFactory.getDriver(); 
		
		HomePage homepage= new HomePage(driver);
				homepage.clickOnMyAccount();
				homepage.selectLoginOption();
	    	}

	@When("User has entered valid email address {string} in to the email field")
	public void user_has_entered_valid_email_address_in_to_the_email_field(String emailText) {
		
		loginpage= new LoginPage(driver);
		loginpage.enterEmailAddress(emailText);
			    	}

	@When("User has entered valid password {string} in to password field")
	public void user_has_entered_valid_password_in_to_password_field(String passwordText) {
		
		loginpage.enteredPassword(passwordText);
		
	}

	@When("User clicks on the login button")
	public void user_clicks_on_the_login_button() {
		loginpage.loginButton();
		}

	@Then("user should get successfully logged in")
	public void user_should_get_successfully_logged_in() {
		
		AccountPage accoutpage = new AccountPage(driver);
		
	Assert.assertTrue(accoutpage.displayStatusOfEditYourAccountInformationOption());
		
	}

	@Given("user is has navigated login page")
	public void user_is_has_navigated_login_page() {
		
driver.findElement(By.xpath("//span[text()='My Account']")).click();
		
		driver.findElement(By.linkText("Login"));
	    
	}

	@When("user enters invalid email address {string} into email field")
	public void user_enters_invalid_email_address_into_email_field(String invalidEmailText) {
		
		
		driver.findElement(By.id("input-email")).sendKeys("invalidEmailText");
	    
	}

	@When("User enters invalid password {string} into password field")
	public void user_enters_invalid_password_into_password_field(String invalidPasswordText) {
	 
		driver.findElement(By.id("input-password")).sendKeys("invalidPasswordText");
		
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();	
	    
	}

	@Then("User should be get a warring message about credentials mismatching")
	public void user_should_be_get_a_warring_message_about_credentials_mismatching() {
		
		Assert.assertTrue
		(driver.findElement(By.xpath("//div[contains (@class, 'alert-dismissible')]")).getText().contains("Warning: No match for E-Mail Address and/or Password."));
		
	}

	@Given("User has navigated to the Login Page")
	public void user_has_navigated_to_the_login_page() {
		
driver.findElement(By.xpath("//span[text()='My Account']")).click();
		
		driver.findElement(By.linkText("Login"));
	    
	}

	@When("User enters valid email address {string} into the email field")
	public void user_enters_valid_email_address_into_the_email_field(String emailText) {
		
		driver.findElement(By.id("input-email")).sendKeys(emailText);
	    
	}

	@When("User enters invalid password {string} in to the passwor filed")
	public void user_enters_invalid_password_in_to_the_passwor_filed(String invalidPasswordText) {
		
		driver.findElement(By.id("input-password")).sendKeys("invalidPasswordText");
	 
	}

	@When("User Clicks on the login page")
	public void user_clicks_on_the_login_page() {
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		
		driver.findElement(By.linkText("Login"));
		
	}

	@Then("user has should get warring message about password invalid")
	public void user_has_should_get_warring_message_about_password_invalid() {
		Assert.assertTrue
		(driver.findElement
				(By.xpath("//div[contains (@class, 'alert-dismissible')]")).getText().contains
				("Warning: No match for E-Mail Address and/or Password."));

	    
	}

	@Given("User has navigate to login page")
	public void user_has_navigate_to_login_page() {
	    
driver.findElement(By.xpath("//span[text()='My Account']")).click();
		
		driver.findElement(By.linkText("Login"));
	}

	@When("Users enters the invalid email address {string}")
	public void users_enters_the_invalid_email_address(String invalidEmailText) {
		
		driver.findElement(By.id("input-email")).sendKeys("invalidEmailText");
	    
	}

	@When("Users has entered valid password {string} into password field")
	public void users_has_entered_valid_password_into_password_field(String passwordText) {
		driver.findElement(By.id("input-password")).sendKeys(passwordText);
	    
	}

	@When("Users has clicks on the Login button")
	public void users_has_clicks_on_the_login_button() {
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("User should get warnning message about email address invalid")
	public void user_should_get_warnning_message_about_email_address_invalid() {
	    
		Assert.assertTrue
		(driver.findElement(By.xpath("//div[contains (@class, 'alert-dismissible')]"))
				.getText().contains("Warning: No match for E-Mail Address and/or Password."));

	}

	@Given("users has navigated to the Login Page")
	public void users_has_navigated_to_the_login_page() {
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		
		driver.findElement(By.linkText("Login"));
	    
	}

	@When("user has dont enter any email address into the email field")
	public void user_has_dont_enter_any_email_address_into_the_email_field() {
	    
		driver.findElement(By.id("input-email")).sendKeys("");
		
	}

	@When("user has dont enter any password into the password field")
	public void user_has_dont_enter_any_password_into_the_password_field() {
	    
		driver.findElement(By.id("input-password")).sendKeys("");
	}

	@When("Users clicks on the Login Button")
	public void users_clicks_on_the_login_button() {
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	    
	}

	@Then("user should get warrning message about credentials mismatch")
	public void user_should_get_warrning_message_about_credentials_mismatch() {
		Assert.assertTrue
		(driver.findElement(By.xpath("//div[contains (@class, 'alert-dismissible')]")).getText().contains("Warning: No match for E-Mail Address and/or Password."));
	}

}
