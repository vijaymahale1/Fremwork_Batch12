package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	
	//WebElement--Login WebPage
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement text_emailid;
	
	
	@FindBy(how=How.XPATH,using="//input[@name='pass']")
	private WebElement text_password;

	
	@FindBy(how=How.XPATH,using="//button[@name='login']")
	private WebElement button_Login;
	
	
	public WebElement getText_emailid() {
		return text_emailid;
	}



	public WebElement getText_password() {
		return text_password;
	}




	public WebElement getButton_Login() {
		return button_Login;
	}



	
}
