package com.automation.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoLoginTest {
public static WebDriver driver; 	
	public void launchApplication () {
	// launch the application
	System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize(); // maximize the window
	driver.get("https://www.saucedemo.com/");
	
	}
	
	// close the application
	
	public void tearDownBrowser() {
		driver.quit();
	}
	
	public void loginfunction(String username, String password) throws InterruptedException
	{
		WebElement usernamefield = driver.findElement(By.xpath("//div[@class='form_group']//input[@id='user-name']"));
		usernamefield.sendKeys(username);
		WebElement passwordfield = driver.findElement(By.xpath("//div[@class='form_group']//input[@id='password']"));
		passwordfield.sendKeys(password);
		WebElement loginbutton = driver.findElement(By.xpath("//div[@class='login-box']//input[@id='login-button']"));
		loginbutton.click();
		Thread.sleep(5000);
		
		
	}
	
	public void logincheck() {
		String actualUrl ="https://www.saucedemo.com/inventory.html";
		String expectedUrl= driver.getCurrentUrl();
		if(actualUrl.equalsIgnoreCase(expectedUrl)) {
			System.out.println("Test Passed");
		}
			else {
				System.out.println("Test Failed");
			
		}
		
	}
	
	
	public static void main(String[] args) throws InterruptedException  {
		
	
	
	//first test
	SauceDemoLoginTest saucedemo =new SauceDemoLoginTest();
	saucedemo.launchApplication();
	saucedemo.loginfunction("standard_user",  "secret_sauce");
	saucedemo.logincheck();
	
	// second test
	saucedemo.launchApplication();
	saucedemo.loginfunction("test",  "test");
	saucedemo.logincheck();
	
		
		
		
		
		
	}
	
	

}
