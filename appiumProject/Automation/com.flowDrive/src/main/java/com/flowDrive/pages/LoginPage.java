package com.flowDrive.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flowDrive.initialize.AndroidDriverr;

public class LoginPage {
	
	@FindBy (id = "com.thefloow.flo:id/btn_agree")
	public WebElement agreeTerms;
	
	@FindBy (id = "com.thefloow.flo:id/edit_text_email")
	public WebElement userName;
	
	@FindBy (id = "com.thefloow.flo:id/edit_text_password")
	public WebElement password;
	
	@FindBy (id = "com.thefloow.flo:id/btn_login")
	public WebElement loginButton;
	
	@FindBy (id = "android:id/button1")
	public WebElement invalidAlert;
	
	public LoginPage() {
		PageFactory.initElements(AndroidDriverr.driver, this);
	}
	

}
