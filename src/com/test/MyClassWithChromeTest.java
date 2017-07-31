package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClassWithChromeTest {
	/// hi this is temp
	public static void main (String args[]){
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\selenium-chrome-driver-2.3.1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com");
	}

}
