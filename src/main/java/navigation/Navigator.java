package navigation;

import org.openqa.selenium.WebDriver;

public class Navigator {

	private final WebDriver driver;
	
	public Navigator(WebDriver driver) {
		this.driver = driver;
	}
	
	public void navigateTo(String url) {
		try {
			driver.navigate().to(url);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
