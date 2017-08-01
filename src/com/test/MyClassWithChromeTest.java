package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClassWithChromeTest {
	/// hi this is temp
	public static void main (String args[]){
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com");
		
		 String appUrl = "https://accounts.google.com"; 
		// launch the firefox browser and open the application url 
		              
		              driver.get(appUrl); 
		              
		              // the test getting failed i need to check why...
		// maximize the browser window 
		              driver.manage().window().maximize(); 
		              
		// declare and initialize the variable to store the expected title of the webpage. 
		              String expectedTitle = "Sign in - Google Accounts"; 
		// fetch the title of the web page and save it into a string variable 
		              String actualTitle = driver.getTitle(); 
		              System.out.println("Tital we got is ++++++++:" +actualTitle);
		// compare the expected title of the page with the actual title of the page and print the result 
		              if (expectedTitle.equals(actualTitle)) 
		              { 
		                     System.out.println("Verification Successful - The correct title is displayed on the web page."); 
		              } 
		             else 
		              { 
		                     System.out.println("Verification Failed - An incorrect title is displayed on the web page."); 
		              } 

		// enter a valid username in the email textbox 
		              WebElement username = driver.findElement(By.xpath("//*[@id='identifierId']")); 
		              username.clear(); 
		              username.sendKeys("chendake.sampada"); 
		// enter a valid password in the password textbox 
		              WebElement nextButton = driver.findElement(By.xpath("//*[@id='identifierNext']/content/span"));
		              nextButton.click();
		             /* WebElement paaskey = driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input"));
		              paaskey.clear();
		              paaskey.sendKeys(arg0);*/
		              WebElement password = driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")); 
		              password.clear(); 
		              password.sendKeys("DJSAM@123"); 
		// click on the Sign in button 
		              WebElement SignInButton = driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")); 
		              SignInButton.click(); 
		// close the web browser 
		              driver.close(); 
		              System.out.println("Test script executed successfully. You have successfullu Logged In :"); 
		// terminate the program 
		              //System.exit(0); 
		              driver.quit();
		       } 


	}


