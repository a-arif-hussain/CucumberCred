package org.Stepdefenition;

import org.base.UtilityClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.pojoclasses.LoginPOJO;
import org.pojoclasses.NewUserLoginpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefenition extends UtilityClass {

	

	@Given("User should be in Credor Login page")
	public void user_should_be_in_Credor_Login_page() throws InterruptedException {
		browserLaunch();
		launchUrl("https://credor-app.azurewebsites.net/");
		maxWindow();
		waits2();
	}

	@When("User enters the invalid username and invalid password")
	public void user_enters_the_invalid_username_and_invalid_password() {

		LoginPOJO l = new LoginPOJO();
		passTxt(l.getEmailtxt(), "Aarif123@gmail.com");
		passTxt(l.getPassTxt(), "ghghhg");

	}

	@When("User enters valid username and valid password")
	public void user_enters_valid_username_and_valid_password() {
		LoginPOJO l = new LoginPOJO();
		passTxt(l.getEmailtxt(), "aarif.hard14@gmail.com");
		passTxt(l.getPassTxt(), "Noor@1408");

	}

	@When("User click the login button")
	public void user_click_the_login_button() {
		LoginPOJO l = new LoginPOJO();
		clickWebElement(l.getLoginBtn());
	}

	@Then("User should get invalid credentials message")
	public void user_should_get_invalid_credentials_message() {

		String Url = driver.getCurrentUrl();
		System.out.println(Url);

	}

	@Then("User should get valid credentials message")
	public void user_should_get_valid_credentials_message() {
		String Url = driver.getCurrentUrl();
		System.out.println(Url);

	}
	
	@When("user have to click the register button")
	public void user_have_to_click_the_register_button() throws InterruptedException {
		
		 NewUserLoginpage n = new NewUserLoginpage();
		 clickWebElement(n.getClickRegisterHereButton());
		 implicitwaits();
	 
	}

	@When("user have to enter the first name")
	public void user_have_to_enter_the_first_name() {
		 NewUserLoginpage n = new NewUserLoginpage();
		 passTxt(n.getFisrtName(), "Aarif");
	}

	@When("user have to enter the last name")
	public void user_have_to_enter_the_last_name() {
		 NewUserLoginpage n = new NewUserLoginpage();
		 passTxt(n.getLastName(), "Hussain");
	}

	@When("user have to enter the email")
	public void user_have_to_enter_the_email() {
		 NewUserLoginpage n = new NewUserLoginpage();
		 passTxt(n.getEmailtxt(), "aarif.hard@gmail.com");
	}

	@When("user have to enter the phonenumber")
	public void user_have_to_enter_the_phonenumber() {
		NewUserLoginpage n = new NewUserLoginpage();
		passTxt(n.getPhoneNumber(), "90090090909");
	}

	@When("user have to select the residency")
	public void user_have_to_select_the_residency() {
		
		WebElement residency = driver.findElement(By.xpath("//select[@id='register_rf_residency']"));
		Select s = new Select(residency);
		s.selectByVisibleText("Alabama");
//		NewUserLoginpage n = new NewUserLoginpage();
//		toSelectval(n.getResidency(), "Alabama");
	}

	@When("user have to enter the create password")
	public void user_have_to_enter_the_create_password() {
		NewUserLoginpage n = new NewUserLoginpage();
		passTxt(n.getRegNewPassword(), "Abchkbk");
	   
	}

	@When("user have to enter the confirm password")
	public void user_have_to_enter_the_confirm_password() {
		NewUserLoginpage n = new NewUserLoginpage();
		passTxt(n.getConfirmPassword(), "Aarifhxano");
	}

	@Then("user have to click the continue button")
	public void user_have_to_click_the_continue_button() {
		NewUserLoginpage n = new NewUserLoginpage();
		clickWebElement(n.getConButton());
	}

}
