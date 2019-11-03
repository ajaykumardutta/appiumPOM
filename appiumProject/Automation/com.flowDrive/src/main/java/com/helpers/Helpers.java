package com.helpers;

import java.util.Random;

import org.openqa.selenium.Alert;

import com.flowDrive.initialize.AndroidDriverr;

public class Helpers {

	public static String randomString(int number) {
		String alphaNumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder sb = new StringBuilder();
		Random rnd = new Random();
		while (sb.length() < number) { // length of the random string.
			int index = (int) (rnd.nextFloat() * alphaNumeric.length());
			sb.append(alphaNumeric.charAt(index));
		}
		String saltStr = sb.toString();
		return saltStr;
	}

	public static void acceptAlert() {
		Alert al = AndroidDriverr.driver.switchTo().alert();
		al.accept();
	}
}
