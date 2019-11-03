package com.flowDrive.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flowDrive.initialize.AndroidDriverr;

public class EmergencyPage {
	@FindBy(id = "com.thefloow.flo:id/btn_emergency")
	public WebElement emergencyButton;

	@FindBy(id = "com.thefloow.flo:id/emergency_btn_breakdown")
	public WebElement breakDown;

	@FindBy(id = "com.thefloow.flo:id/emergency_btn_accident")
	public WebElement accidentBTN;

	@FindBy(id = "com.thefloow.flo:id/btn_call_now")
	public WebElement callNow;
		
	@FindBy(id = "android:id/button1")
	public WebElement demoMSG;
	
	@FindBy(xpath = "//android.widget.TextView[@text='If you need our assistance, please call us now.']")
	public WebElement callNowTXT;
	
	public EmergencyPage() {
		PageFactory.initElements(AndroidDriverr.driver, this);
	}
}
