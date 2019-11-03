package com.flowDrive.initialize;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class AndroidDriverr {
	
	public static AppiumDriver driver;
	public static DesiredCapabilities caps;
	
	@BeforeSuite
	public void beforeSuite() throws MalformedURLException {
		caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Android");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "6.0");
		caps.setCapability("appPackage", "com.thefloow.flo");
		caps.setCapability("appActivity", "com.thefloow.flo.activity.LauncherActivity");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	@AfterSuite
	public void afterSuite() {
//		driver.close();
	}
	
	
	

}
