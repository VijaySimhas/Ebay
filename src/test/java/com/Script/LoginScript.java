package com.Script;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.Library.BaseClass;
import com.Pages.LoginPage;
import com.Pages.ProductDetailsPage;

public class LoginScript extends BaseClass {
	LoginPage login;
	ProductDetailsPage prdt;

	// Scenario: SignIn and search for product and add to cart and purchase it
	// Unable to capture elements under SignIn Page
	// product details not listiong in app displays no result found ,based on
	// product searched: Ex:apple iphone 6
	@Test
	public void loginTest() {
		login = new LoginPage(mobiledriver);
		prdt = new ProductDetailsPage(mobiledriver);

		login.hamburgMenu.click();
		login.ebaySignInLogo.click();
		login.Email.sendKeys("vijay@mail.com");
		login.Password.sendKeys("xyz");
		login.signInButton.click();
		prdt.searchBox.click();
		prdt.searchtext.sendKeys("apple iphone 6");
		prdt.prdtText.click();// clicked on selected phone
		prdt.itemTitle.click();// Gold selected

	}
}
