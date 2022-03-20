package V1.org.flipkart.com.base_tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import navigation.Navigator;
import webdriver_builder.WebDriverBuilder;

public class BaseBrowserTest {

	public WebDriver driver;
	String loginUrl;

	public BaseBrowserTest() {
		loginUrl = "https://" + System.getProperty("login.url");
	}

	@BeforeMethod
	public void driverSetup() {
		WebDriverBuilder wdb = new WebDriverBuilder();
		driver = wdb.getDriver();
		Navigator nav = new Navigator(driver);
		nav.navigateTo(loginUrl);
	}

	@AfterMethod
	public void driverCleanp() {
		driver.quit();
	}
}
