package org.pojoclasses;

import org.base.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewUserLoginpage extends UtilityClass{
	
	public NewUserLoginpage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Register here']")
	private WebElement clickRegisterHereButton;
	
	
	@FindBy(xpath="//input[@id='register_rf_firstname']")
	private WebElement fisrtName;
	
	
	@FindBy(xpath="//input[@id='register_rf_lastname']")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@id='register_rf_email']")
	private WebElement emailtxt;
	
	
	@FindBy(xpath="//input[@id='register_rf_phonenumber']")
	private WebElement phoneNumber;
	
	
	@FindBy(xpath="//option[text()=' Alabama ']")
	private WebElement residency;
	
	@FindBy(xpath="//input[@id='register_rf_createpassword']")
	private WebElement regNewPassword;
	
	
	@FindBy(xpath="//input[@id='confirmpassword']")
	private WebElement confirmPassword;
	
	@FindBy(xpath="//button[@id='register_rf_continue']")
	private WebElement conButton;

	public WebElement getClickRegisterHereButton() {
		return clickRegisterHereButton;
	}

	public WebElement getFisrtName() {
		return fisrtName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmailtxt() {
		return emailtxt;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getResidency() {
		return residency;
	}

	public WebElement getRegNewPassword() {
		return regNewPassword;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public WebElement getConButton() {
		return conButton;
	}
	
	

}
