package V1.org.flipkart.com.smoke_and_sanity_tests;

import org.flipkart.com.page_objects.flipkart_website_page_objects.login.FlipkartLogin;
import org.testng.Assert;
import org.testng.annotations.Test;

import V1.org.flipkart.com.base_tests.BaseBrowserTest;

public class ValidateLoginPage extends BaseBrowserTest{

	public ValidateLoginPage() {
		super();
	}
	
	@Test
	public void validateLoginFunctionality() {
		FlipkartLogin objFlipkartLogin = new FlipkartLogin(driver);
		Assert.assertTrue(objFlipkartLogin.fillEmailTextbox(), "Unable to enter email");
		Assert.assertTrue(objFlipkartLogin.fillPasswordTextbox(), "Unable to enter password");
		Assert.assertTrue(objFlipkartLogin.clickOnLoginButton(), "Unable to click on Login button");
	}
	
}
