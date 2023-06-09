package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	
	WebDriver driver;
	
	
	@Given("User navigates to Register Account Page")
	public void user_navigates_to_register_account_page() {
	   
		
		driver=DriverFactory.getDriver();
		driver.findElement(By.xpath("//span[text()='My Account']"));
		driver.findElement(By.linkText("Register"));
		
		
	}

	@When("User enters the below details")
	public void user_enters_the_below_details(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
		
	Map<String, String>	dataMap=dataTable.asMap(String.class, String.class);
	
	driver.findElement(By.id("input-firstname")).sendKeys(dataMap.get("firstName"));
	driver.findElement(By.id("input-lastname")).sendKeys(dataMap.get("lastName"));
	driver.findElement(By.id("input-email")).sendKeys(dataMap.get("email"));
	driver.findElement(By.id("input-telephone")).sendKeys(dataMap.get("telephone"));
	driver.findElement(By.id("input-password")).sendKeys(dataMap.get("password"));
	driver.findElement(By.id("input-confirm")).sendKeys(dataMap.get("password"));
	   
	}

	@When("User Selects Privacy Policy")
	public void user_selects_privacy_policy() {
		
		driver.findElement(By.name("agree")).click();
	   
	}

	@When("User clicks on Continue button")
	public void user_clicks_on_continue_button() {
		
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}

	@Then("User account should get created successfully.")
	public void user_account_should_get_created_successfully() {

Assert.assertEquals("Your Account Has Been Created!",
		driver.findElement(By.xpath("//div[@id='content']/h1")).getText());
	}

	@When("User Selects Yes for Newsletter")
	public void user_selects_yes_for_newsletter() {
		
		driver.findElement(By.xpath("//input[@name='newsletter'][@value='1']")).click();

	}

	@Then("User has should get warning messages already registered email.")
	public void user_has_should_get_warning_messages_already_registered_email() {

		Assert.assertTrue
		(driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText().contains
				("Warning: E-Mail Address is already registered!"));
	}

	@When("User Dont enter any details into fields")
	public void user_dont_enter_any_details_into_fields() {
		
//intentionally kept blank
		
		
		
	}

//	@When("Clicks on Continue button")
//	public void clicks_on_continue_button() {
//
//		driver.findElement(By.xpath("//input[@value='Continue']")).click();
//	
//	}

	@Then("User should get proper warning messages for every field")
	public void user_should_get_proper_warning_messages_for_every_field() {
		
	Assert.assertTrue(driver.findElement
			(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText()
			.contains("Warning: You must agree to the Privacy Policy!"));
	
	Assert.assertEquals("First Name must be between 1 and 32 characters!", 
			driver.findElement(By.xpath("//input[@id='input-firstname']/following-sibling::div")).getText());
	
	
	Assert.assertEquals("Last Name must be between 1 and 32 characters!",
			driver.findElement(By.xpath("//input[@id='input-lastname']/following-sibling::div")).getText());
	Assert.assertEquals("E-Mail Address does not appear to be valid!",
			driver.findElement(By.xpath("//input[@id='input-email']/following-sibling::div")).getText());
	Assert.assertEquals("Telephone must be between 3 and 32 characters!", 
			driver.findElement(By.xpath("//input[@id='input-telephone']/following-sibling::div")).getText());
	Assert.assertEquals("Password must be between 4 and 20 characters!",
			driver.findElement(By.xpath("//input[@id='input-password']/following-sibling::div")).getText());
	
	}
}
