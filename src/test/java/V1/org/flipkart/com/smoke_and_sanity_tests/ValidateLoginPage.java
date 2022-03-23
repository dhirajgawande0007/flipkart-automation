package V1.org.flipkart.com.smoke_and_sanity_tests;

import java.io.IOException;
import java.net.MalformedURLException;

import org.flipkart.com.page_objects.flipkart_website_page_objects.login.FlipkartLogin;
import org.testng.Assert;
import org.testng.annotations.Test;

import V1.org.flipkart.com.base_tests.BaseBrowserTest;

public class ValidateLoginPage extends BaseBrowserTest {

	public ValidateLoginPage() {
		super();
	}

	@Test
	public void validateLoginFunctionality() {
		FlipkartLogin objFlipkartLogin = new FlipkartLogin(driver);
		Assert.assertTrue(objFlipkartLogin.fillEmailTextbox(), "Unable to enter email");
		Assert.assertTrue(objFlipkartLogin.fillPasswordTextbox(), "Unable to enter password");
		Assert.assertTrue(objFlipkartLogin.clickOnLoginButton(), "Unable to click on Login button");
		/* Below method is used to verify that the login label is invisible. So that the script knows 
		 the login popup is closed. */
		Assert.assertTrue(objFlipkartLogin.verifyLoginLabelNotPresent(), "Login label is present");
}

	@Test
	public void validateLoginPageUI() throws MalformedURLException, IOException {
		FlipkartLogin objFlipkartLogin = new FlipkartLogin(driver);
		Assert.assertEquals(objFlipkartLogin.getLoginLabel(), "Login");
		Assert.assertEquals(objFlipkartLogin.getAccessLabel(),
				"Get access to your Orders, Wishlist and Recommendations");
		Assert.assertTrue(objFlipkartLogin.getTermsOfUseLinkStatus(), "Terms of Use link is broken");
		Assert.assertTrue(objFlipkartLogin.getPrivacyPolicyLinkStatus(), "Privacy Policy link is broken");
		Assert.assertTrue(objFlipkartLogin.verifyRequestOtpButtonIsPresent(), "Unable to locate Request Otp Button");
		Assert.assertEquals(objFlipkartLogin.getCreateAnAccountLinkText(), "New to Flipkart? Create an account");
	}

	@Test
	public void validateValidationMessages(){
		FlipkartLogin objFlipkartLogin = new FlipkartLogin(driver);
		Assert.assertTrue(objFlipkartLogin.clickOnLoginButton(), "Unable to click on Login button");
		Assert.assertEquals(objFlipkartLogin.getEmailIdValidationMessage(), "Please enter valid Email ID/Mobile number");
		Assert.assertTrue(objFlipkartLogin.fillEmailTextbox(), "Unable to enter email");
		Assert.assertTrue(objFlipkartLogin.clickOnLoginButton(), "Unable to click on Login button");
		Assert.assertEquals(objFlipkartLogin.getEnterPasswordValidationMessage(),"Please enter Password");
	}
}
