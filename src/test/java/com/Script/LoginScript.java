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
	@DataProvider(name="signInData")
	public Object[][] readData() throws Exception {
		String[][] retObjArr = datamanager.getTableArray(ConfigurationLibrary.xlpath_login, ConfigurationLibrary.xlsheet_login02, ConfigurationLibrary.xlDataTable_login);
		return retObjArr;
	}
	
	@Test(dataProvider = "signInData")
 	public void loginTest(String username,String password) {
		login = new LoginPage(mobiledriver);
		prdt = new ProductDetailsPage(mobiledriver);

		login.hamburgMenu.click();
		login.ebaySignInLogo.click();
		login.Email.sendKeys(username);
		login.Password.sendKeys(password);
		login.signInButton.click();
		prdt.searchBox.click();
		prdt.searchtext.sendKeys("apple iphone 6");
		prdt.prdtText.click();// clicked on selected phone
		prdt.itemTitle.click();// Gold selected

	}
}
