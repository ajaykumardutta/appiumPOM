package com.flowDrive.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import com.flowDrive.initialize.AndroidDriverr;
import com.flowDrive.pages.EmergencyPage;
import com.flowDrive.pages.HomePage;
import com.flowDrive.pages.LoginPage;
import com.flowDrive.pages.RegisterPage;
import com.flowDrive.pages.SocialPage;
import com.helpers.Helpers;

import io.appium.java_client.android.AndroidKeyCode;

public class WorkFlow1_Test {
	LoginPage loginPage;
	RegisterPage registerPage;
	HomePage homePage;
	EmergencyPage emergencyPage;
	SocialPage socialPage;
	WebDriverWait wait;

	@BeforeClass
	public void beforeClass() {
		loginPage = new LoginPage();
		registerPage = new RegisterPage();
		homePage = new HomePage();
		emergencyPage = new EmergencyPage();
		socialPage = new SocialPage();
		wait = new WebDriverWait(AndroidDriverr.driver, 10);
	}

	@Test
	public void loginTest() {
		try {
			loginPage.agreeTerms.click();
			loginPage.userName.sendKeys("aaa@gmail.com");
			loginPage.password.sendKeys("abcd1234");
			loginPage.loginButton.click();
			wait.until(ExpectedConditions.visibilityOf(registerPage.welcomeMessageClose));
			registerPage.welcomeMessageClose.click();
		} catch (Exception e) {
			Assert.fail("Error in login testcase");
		}
	}

	@Test
	public void registerTest() {
		try {
			loginPage.agreeTerms.click();
			registerPage.createAccount.click();
			registerPage.firstName.sendKeys(Helpers.randomString(6));
			registerPage.surName.sendKeys(Helpers.randomString(5));
			registerPage.dateOfBirth.sendKeys("11/11/1990");
			Thread.sleep(2000);
			AndroidDriverr.driver.findElement(By.xpath("//android.widget.Button[@index='0']")).click();
			Thread.sleep(2000);
			registerPage.dateOfBirthOkBtn.click();
			registerPage.emailAdress.sendKeys("teju4p@gmail.com");
			registerPage.postCode.sendKeys("12345");
			registerPage.companyName.sendKeys(Helpers.randomString(3));
			registerPage.password.sendKeys("abcd1234");
			registerPage.repeatPassword.sendKeys("abcd1234");
			Assert.assertTrue(
					registerPage.registerSucess.getText().trim().equals("Registration successful, please login."));
		} catch (Exception e) {
			Assert.fail("Error in register testcase");
		}

	}

	@Test
	public void startJourney() {
		try {
			loginTest();
			homePage.homeButton.click();
			homePage.startJourney.click();
			wait.until(ExpectedConditions.visibilityOf(homePage.cancelJourney));
			Thread.sleep(3000);
			homePage.cancelJourney.click();
		} catch (Exception e) {
			Assert.fail("Error in login testcase");
		}
	}


	@Test
	public void emergencyOrAccident() {
		try {
			loginTest();
			emergencyPage.emergencyButton.click();
			emergencyPage.breakDown.click();
			emergencyPage.callNow.click();
			wait.until(ExpectedConditions.visibilityOf(emergencyPage.demoMSG));
			emergencyPage.demoMSG.click();
			AndroidDriverr.driver.navigate().back();
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOf(emergencyPage.emergencyButton));
			emergencyPage.emergencyButton.click();
			emergencyPage.accidentBTN.click();
			Assert.assertTrue(emergencyPage.callNowTXT.getText().equals("If you need our assistance, please call us now."), "Text should be matched, call now screen");
			
		} catch (Exception e) {
			Assert.fail("Error in login testcase");
		}
	}
	
	
	@Test
	public void socialNetowrk() {
		try {
			loginTest();
			socialPage.socialLINK.click();
			socialPage.myScoresLNK.click();
			Assert.assertTrue(socialPage.myscoresTXT.getText().trim().equals("MY SCORES"), "text should be my scores");
			AndroidDriverr.driver.navigate().back();
			socialPage.friendsLNK.click();
			Assert.assertTrue(socialPage.friendsTXT.getText().trim().equals("FRIENDS"), "text should be friends");
			socialPage.myProfileLNK.click();
			socialPage.gettingStartedTXT.sendKeys(Helpers.randomString(3));
			socialPage.nextBTN.click();
			socialPage.nextBTN2.click();
			socialPage.aboutMeTXT.sendKeys(Helpers.randomString(5));
			socialPage.nextBTNProf.click();

		} catch (Exception e) {
			Assert.fail("Error in login testcase");
		}
	}
	
	
	
	@AfterClass
	public void afterMethod() {
		AndroidDriverr.driver.closeApp();
	}

}
