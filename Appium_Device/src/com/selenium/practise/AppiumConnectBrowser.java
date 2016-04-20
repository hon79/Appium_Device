package com.selenium.practise;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumConnectBrowser {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities capabilities=new DesiredCapabilities().android();
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserType.CHROME);
		capabilities.setCapability(MobileCapabilityType.PLATFORM, Platform.ANDROID);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"myphone");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"5.1.1");
		
		URL url= new URL("http://127.0.0.1:4723/wd/hub");
		 
		// Create object of  AndroidDriver class and pass the url and capability that we created
		 WebDriver driver = new AndroidDriver(url, capabilities);
		 
		// Open url
		  driver.get("http://www.facebook.com");
		 
		 // print the title
		  System.out.println("Title "+driver.getTitle());
		 
		// enter username
		driver.findElement(By.name("email")).sendKeys("meetpallu22@yahoo.com");
		 
		// enter password
		      driver.findElement(By.name("pass")).sendKeys("srinu2211");
		 
		// click on submit button
		driver.findElement(By.id("u_0_5")).click();
		 
		// close the browser
		//driver.quit();
		 
	}

}
