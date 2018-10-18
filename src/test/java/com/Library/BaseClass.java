package com.Library;

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	public static AndroidDriver<WebElement> mobiledriver = null;
//	public DesiredCapabilities capabilities = null;
	public static final String fwPath = System.getProperty("user.dir");
	
	@BeforeMethod
	public void launchApp() {
		try {

			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("automationName", "1.8.1");
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
			capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_S_API_28:5554");
			//capabilities.setCapability("app", "/Users/vini/eclipse-workspace/Demo_NexusPhone/apks/MultiTouch Tester.apk");
			capabilities.setCapability("app", fwPath+"//appFiles//eBay.apk");
			capabilities.setCapability("appPackage", "com.ebay.mobile");
			capabilities.setCapability("appActivity", "com.ebay.mobile.activities.MainActivity");	
			capabilities.setCapability("newCommandTimeout", 2000);
			
			capabilities.setCapability("fullReset", "false");
			capabilities.setCapability("noReset", "false");
			
			mobiledriver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			
		
			Reporter.log("Successfully launched the application");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	public void closeApp()
	{
		mobiledriver.close();
	}
}