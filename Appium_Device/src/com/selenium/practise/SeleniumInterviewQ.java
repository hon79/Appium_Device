package com.selenium.practise;

import java.util.List;

import org.openqa.jetty.html.Link;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumInterviewQ {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		//1. To find all the links in the web page and print them
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		

	}

}
