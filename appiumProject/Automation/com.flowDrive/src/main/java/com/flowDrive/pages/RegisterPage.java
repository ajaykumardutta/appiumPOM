package com.flowDrive.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flowDrive.initialize.AndroidDriverr;

public class RegisterPage {
	
	@FindBy (id = "com.thefloow.flo:id/text_view_create_account")
	public WebElement createAccount;

	@FindBy (id = "com.thefloow.flo:id/edit_text_first_name")
	public WebElement firstName;
	
	@FindBy (id = "com.thefloow.flo:id/edit_text_surname")
	public WebElement surName;
	
	@FindBy (id = "com.thefloow.flo:id/edit_text_date_of_birth")
	public WebElement dateOfBirth;
	
	@FindBy (id = "com.thefloow.flo:id/edit_text_email")
	public WebElement emailAdress;
	
	@FindBy (id = "com.thefloow.flo:id/edit_text_postcode")
	public WebElement postCode;
	
	@FindBy (id = "com.thefloow.flo:id/edit_text_company_name")
	public WebElement companyName;
	
	@FindBy (id = "com.thefloow.flo:id/edit_text_password")
	public WebElement password;
	
	@FindBy (id = "com.thefloow.flo:id/edit_text_confirm_password")
	public WebElement repeatPassword;
	
	@FindBy (id = "com.thefloow.flo:id/button_register")
	public WebElement register;
	
	@FindBy (id = "com.thefloow.flo:id/text_view_promo_blurb_1")
	public WebElement registerSucess;
	
	@FindBy (id = "com.thefloow.flo:id/btn_welcome_close")
	public WebElement welcomeMessageClose;
	
	@FindBy (xpath = "//android.widget.Button[@text='OK']")
	public WebElement dateOfBirthOkBtn;
	
	
	public RegisterPage() {
		PageFactory.initElements(AndroidDriverr.driver, this);
	}

}
