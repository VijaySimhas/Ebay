package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage {

	AndroidDriver<WebElement> driver = null;

	public LoginPage(AndroidDriver<WebElement> driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@AndroidFindBy(id = "com.ebay.mobile:id/home")
	public MobileElement hamburgMenu;

	@AndroidFindBy(id = "com.ebay.mobile:id/logo")
	public MobileElement ebaySignInLogo;

	@AndroidFindBy(xpath = "//*[@text='Email or username']")
	public MobileElement Email;

	@AndroidFindBy(xpath = "//*[@text='Password']")
	public MobileElement Password;

	@AndroidFindBy(xpath = "//*[@text='SignIn']")
	public MobileElement signInButton;

}
