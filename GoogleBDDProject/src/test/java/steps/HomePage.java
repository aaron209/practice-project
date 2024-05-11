package steps;

import java.io.IOException;
import java.time.Duration;

import Functions.HomePageFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import library.PropertiesManager;

public class HomePage {
	HomePageFunctions homePageFunctions = new HomePageFunctions(BaseTest.driver);
	PropertiesManager pro = new PropertiesManager();

	@Given("The user launch the application")
	public void the_user_launches_the_application() throws IOException {
		BaseTest.driver.get(pro.getPropertyValue("url"));
		BaseTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@Then("The user click Try for free")
	public void the_user_click_try_for_free() {
		homePageFunctions.selecttryForFree();
	}
	@Then("The user start free trial")
	public void the_user_start_free_trial() {
		homePageFunctions.startForFreeTrial();
	}
}
