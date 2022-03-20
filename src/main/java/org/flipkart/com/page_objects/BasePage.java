package org.flipkart.com.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    	}catch(Exception e) {
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
    	}catch(Exception e) {
    		e.printStackTrace();
    		return false;
    	}
    }
}
