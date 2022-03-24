package org.flipkart.com.page_objects;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import wait_times.WaitTimes;

public class BasePage {

	public WebDriver driver;
	public WaitTimes waitTimes = new WaitTimes();

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean clickElement(By locator) {
		try {
			WebElement elementToClick = new WebDriverWait(driver, waitTimes.DEFAULT_WAIT)
					.until(ExpectedConditions.elementToBeClickable(locator));
			elementToClick.click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean sendKeysToElement(By locator, String keys) {
		try {
			WebElement elementToRecieveKeys = new WebDriverWait(driver, waitTimes.DEFAULT_WAIT)
					.until(ExpectedConditions.elementToBeClickable(locator));
			elementToRecieveKeys.sendKeys(keys);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public String getElementText(By locator) {
		try {
			WebElement elementText = new WebDriverWait(driver, waitTimes.DEFAULT_WAIT)
					.until(ExpectedConditions.visibilityOfElementLocated(locator));
			return elementText.getText();
		} catch (Exception e) {
			e.getStackTrace();
			return "Failed to get Text from Element.";
		}
	}

	public boolean getLinkStatus(By locator) throws MalformedURLException, IOException {
		try {
			WebElement linkElement = new WebDriverWait(driver, waitTimes.DEFAULT_WAIT)
					.until(ExpectedConditions.visibilityOfElementLocated(locator));
			String url = linkElement.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int responseCode = conn.getResponseCode();
			if (responseCode < 400) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean confirmElementIsNotPresent(By locator) {
		try {
			boolean isLocatorDisappeared = new WebDriverWait(driver, waitTimes.DEFAULT_WAIT)
					.until(ExpectedConditions.invisibilityOfElementLocated(locator));
			if (isLocatorDisappeared) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean confirmElementIsVisible(By locator) {
		try {
			 new WebDriverWait(driver, waitTimes.DEFAULT_WAIT)
					.until(ExpectedConditions.visibilityOfElementLocated(locator));
			 return true;
		}catch(Exception e) {
			return false;
		}
	}

	public boolean hoverOnElement(By locator){
	try{
		WebElement element = new WebDriverWait(driver, waitTimes.DEFAULT_WAIT)
				.until(ExpectedConditions.visibilityOfElementLocated(locator));
		Actions a= new Actions(driver);
		a.moveToElement(element).build().perform();
		return true;
	}catch(Exception e){
	e.printStackTrace();
	return false;
		}
	}

	public boolean scrollToElement(By locator){
		try{
			WebElement element = new WebDriverWait(driver,waitTimes.DEFAULT_WAIT)
					.until(ExpectedConditions.visibilityOfElementLocated(locator));
			JavascriptExecutor js = (JavascriptExecutor) driver;

			for(int i=0;i<=driver.manage().window().getSize().getHeight();i++) {
				js.executeScript("window.scrollBy(0,"+i+")","");
			}
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

}
