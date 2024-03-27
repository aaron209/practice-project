package com.automation.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchFunctionality {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		WebElement searchBar = driver.findElement(By.id("APjFqb"));
	searchBar.sendKeys("where is mount everest located");
	searchBar.sendKeys(Keys.ENTER);
	
driver.navigate().back();
	WebElement about = driver.findElement(By.className("MV3Tnb"));
	System.out.println(about.getText());
	about.click();
	
	driver.navigate().back();
	WebElement store = driver.findElement(By.linkText("Store"));
	System.out.println(store.getText());
	  store.click();
	  WebElement browse =driver.findElement(By.cssSelector("a[aria-label='Browse Pixel 8 Pro and Pixel 8 phones']"));
	  //System.out.println(store.getText());
	  browse.click();
	
	Thread.sleep(5000);
	
driver.quit(); //close/quit the browser/session

		
		
	}

}
