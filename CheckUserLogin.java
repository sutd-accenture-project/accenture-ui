package com.example.piano.seleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckUserLogin {
	
	static String myUserName = "test@gmail.com";
	static String myPassword = "SUTD@Singapore";
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/lyd/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();

		//System.setProperty("webdriver.chrome.driver","/Users/sudiptac/sudiptac/teaching/SUTD/50.003@2018/Test/chromedriver");
		//WebDriver driver = new ChromeDriver();

		//driver.get("https://sudiptac.bitbucket.io");
		driver.get("http://localhost:3000/");
		//driver.get("https://www.google.com.sg");

		// get all the links
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));

		// print all the links
		for (int i = 0; i < links.size(); i=i+1) {
			if(links.get(i).getText().equals( "Login" )){
				links.get( i ).click();
				WebElement username = driver.findElement(By.name("loginEmail"));

				Thread.sleep(1000);

				// send my user name to fill up the box
				username.sendKeys(myUserName);

				Thread.sleep(1000);
				WebElement password = driver.findElement(By.name("loginPassword"));

				Thread.sleep(1000);
				// send my password to fill up the box
				password.sendKeys(myPassword);


			}



		}
		java.util.List<WebElement> buttonList = driver.findElements( By.tagName("button"));
		for(int i=0;i<buttonList.size();i++ ){
			if(buttonList.get(i).getText().equals( "Submit" )){
				buttonList.get( i ).click();
			}
		}





	}
}

