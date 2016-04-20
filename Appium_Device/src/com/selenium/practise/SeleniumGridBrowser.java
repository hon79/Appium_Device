package com.selenium.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumGridBrowser {

	public static void main(String[] args) {
	// selenium webdriver supports browser like
		//Chrome
		//safari
		//ie
		//opera
		//android browser
		
		//firefox
	//	WebDriver driver=new FirefoxDriver();
	//	driver.get("http://www.google.com");
		
		//chromer
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		//iedriver
		//WebDriver driver=new InternetExplorerDriver();
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\Honey\\Documents\\Selenium\\IEDriverServer.exe");
		// to avoid "No such Window Exception"
		//capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		
		driver.get("http://www.google.com");
		expWait(driver,"Privacy");
		System.out.println("will wait");
		driver.findElement(By.partialLinkText("Privacy")).click();
		System.out.println("done");
		
		
	}

	public static void expWait(WebDriver driver,String txt)
	{
		(new WebDriverWait(driver,20)).until(ExpectedConditions.elementToBeClickable(By.partialLinkText(txt)));
	}
}
