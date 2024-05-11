package Functions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePageFunctions {
	public WebDriver driver;

	public HomePageFunctions(WebDriver driver) {
		this.driver = driver;
	}

	// private By tryForFree = By.cssSelector("return
	// document.querySelector('hgf-c360nav').shadowRoot.querySelector('header').querySelector('div
	// > div > div').querySelector('div.trail-container >
	// hgf-button').shadowRoot.querySelector('a.hgf-button')");
	private By firstName = By.name("UserFirstName");
	private By lastName = By.name("UserLastName");
	private By jobTitle = By.name("UserTitle");
	private By next = By.xpath("//div[@class='btn-container']/a");
	private By employes = By.name("CompanyEmployees");
	private By country =By.name("CompanyCountry");

	public void selecttryForFree() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement free = (WebElement) js.executeScript(
				"return document.querySelector('hgf-c360nav').shadowRoot.querySelector('header').querySelector('div > div > div').querySelector('div.trial-container > hgf-button').shadowRoot.querySelector('a.hgf-button')");
		js.executeScript("arguments[0].click();", free);

	}

	public void startForFreeTrial() {
		String mainWindow = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String childWindow = it.next();
			if (!mainWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);

				WebElement selectFirstName = driver.findElement(firstName);
				selectFirstName.sendKeys("nur");
				WebElement selectLastName = driver.findElement(lastName);
				selectLastName.sendKeys("alam");
				WebElement selectJobTitle = driver.findElement(jobTitle);
				selectJobTitle.sendKeys("genralManager");
				WebElement clickNext = driver.findElement(next);
				clickNext.click();
				WebElement selectEmployes = driver.findElement(employes);
				Select select = new Select(selectEmployes);
				select.selectByValue("500");
				WebElement selectCountry =driver.findElement(country);
				Select select1 = new Select(selectCountry);
				select1.selectByVisibleText("Nepal");

				driver.close();

			}
		}
		driver.switchTo().window(mainWindow);
	}

}
