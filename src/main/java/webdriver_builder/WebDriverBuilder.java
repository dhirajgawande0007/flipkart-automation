package webdriver_builder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBuilder {

	public WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--user-agent=browser-tests");
        options.addArguments("--window-size=1400,800");
        return new ChromeDriver(options);
	}
}
