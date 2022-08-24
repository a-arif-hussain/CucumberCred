package org.pojoclasses;

import org.base.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOJO extends UtilityClass {

	public LoginPOJO() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "login_email")
	private WebElement emailtxt;

	@FindBy(id = "login_password")
	private WebElement passTxt;

	@FindBy(id = "login_submit")
	private WebElement loginBtn;

	public WebElement getEmailtxt() {
		return emailtxt;
	}

	public WebElement getPassTxt() {
		return passTxt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

}
