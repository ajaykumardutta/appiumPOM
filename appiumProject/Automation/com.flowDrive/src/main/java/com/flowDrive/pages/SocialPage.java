package com.flowDrive.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flowDrive.initialize.AndroidDriverr;

public class SocialPage {
		public WebElement emergencyButton;

		@FindBy(id = "com.thefloow.flo:id/tab_social")
		public WebElement socialLINK;

		@FindBy(id = "com.thefloow.flo:id/social_screen_name")
		public WebElement gettingStartedTXT;

		@FindBy(id = "com.thefloow.flo:id/btn_getting_started_next")
		public WebElement nextBTN;
			
		@FindBy(id = "com.thefloow.flo:id/btn_step2_next")
		public WebElement nextBTN2;
		
		@FindBy(id = "com.thefloow.flo:id/social_about_me")
		public WebElement aboutMeTXT;
		
		@FindBy(id = "com.thefloow.flo:id/btn_social_profile_next")
		public WebElement nextBTNProf;
		
		@FindBy(id = "com.thefloow.flo:id/social_menu_my_scores")
		public WebElement myScoresLNK;

		@FindBy(xpath = "//android.widget.TextView[@text='MY SCORES']")
		public WebElement myscoresTXT;
		
		@FindBy(id = "com.thefloow.flo:id/social_menu_friends")
		public WebElement friendsLNK;
		
		@FindBy(id = "com.thefloow.flo:id/social_menu_my_profile")
		public WebElement myProfileLNK;
			
		@FindBy(xpath = "//android.widget.TextView[@text='FRIENDS']")
		public WebElement friendsTXT;
		
		@FindBy(xpath = "//android.widget.TextView[@text='MY PROFILE']")
		public WebElement myProfileTXT;
		
		public SocialPage() {
			PageFactory.initElements(AndroidDriverr.driver, this);
		}
}
