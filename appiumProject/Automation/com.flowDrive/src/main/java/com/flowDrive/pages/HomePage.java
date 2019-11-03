package com.flowDrive.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flowDrive.initialize.AndroidDriverr;

public class HomePage {


	@FindBy (id = "com.thefloow.flo:id/tab_home")
	public WebElement homeButton;
	
	@FindBy (id = "com.thefloow.flo:id/btn_start")
	public WebElement startJourney;
	
	@FindBy (id = "com.thefloow.flo:id/btn_cancel_gps")
	public WebElement cancelJourney;
	
	public HomePage() {
		PageFactory.initElements(AndroidDriverr.driver, this);
	}
}
