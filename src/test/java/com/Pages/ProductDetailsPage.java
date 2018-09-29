package com.Pages;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProductDetailsPage {
	
	AndroidDriver driver=null;
	
	public ProductDetailsPage(AndroidDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@AndroidFindBy(id="com.ebay.mobile:id/search_box")
	public MobileElement searchBox;
	
	@AndroidFindBy(id="com.ebay.mobile:id/search_src_text")
	public MobileElement searchtext;
	
	@AndroidFindBy(xpath="//*[text='Email or username']")
	public MobileElement ebayEmail;
	
	@AndroidFindBy(xpath="//*[text='Password']")
	public MobileElement ebayPassword;
	
	@AndroidFindBy(id="com.ebay.mobile:id/text")
	public MobileElement prdtText;
	
	@AndroidFindBy(xpath="//com.ebay.mobile:id/textview_item_title[@index='0']")
	public MobileElement itemTitle;	



}
