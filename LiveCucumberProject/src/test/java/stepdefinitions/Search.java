package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
 WebDriver driver;
	
	@Given("User Open on the Application")
	public void user_open_on_the_application() {
		
		driver= DriverFactory.getDriver();
		
	 
	}

	@When("User Enters the valid product {string} into search box field")
	public void user_enters_the_valid_product_into_search_box_field(String vlaidProductText) {
		
		driver.findElement(By.name("search")).sendKeys(vlaidProductText);
	 
	}

	@When("user click on search button")
	public void user_click_on_search_button() {
		
		driver.findElement(By.xpath("//button[contains(@class,'default btn-lg')]")).click();
	 
	}

	@Then("User should get valid product displayed in search results")
	public void user_should_get_valid_product_displayed_in_search_results() {
		
		Assert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());
	 
	}

//	@Given("User Opens the Application")
//	public void user_opens_the_application() {
//	 
//	}

	@When("user enters invalid product {string} into Search box field")
	public void user_enters_invalid_product_into_search_box_field(String invalidProduct) {
		
		driver.findElement(By.name("search")).sendKeys(invalidProduct);
	
	}

//	@When("User Clicks on the search Button")
//	public void user_clicks_on_the_search_button() {
//	 
//	}

	@Then("User should get a message about no product matching")
	public void user_should_get_a_message_about_no_product_matching() {
	 
		
		Assert.assertEquals("There is no product that matches the search criteria.", 
				driver.findElement(By.xpath("//input[@id='button-search']/following-sibling::p")).getText()); 
	
	}

//	@Given("users open the  application")
//	public void users_open_the_application() {
//	 
//	}

	@When("User dont enter any product name into Search Box field")
	public void user_dont_enter_any_product_name_into_search_box_field() {
	 
		
	//Intentionally kept blank
		
	}

	@When("Users clicks on search button")
	public void users_clicks_on_search_button() {
	 
	}

	@Then("User should get a warning messages about no product matching")
	public void user_should_get_a_warning_messages_about_no_product_matching() {
	 
	}
	
	
}
