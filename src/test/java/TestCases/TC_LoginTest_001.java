package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws IOException {
		//driver.get(baseURL);
		//log.info("URL is Loaded");
		LoginPage lp= new LoginPage(driver);
		lp.setUserName(username);
		log.info("Enter Username");
		lp.setPassword(password);
		
		log.info("Enter Password");
		lp.ClickSubmit();
		
		log.info("Click Submit");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			log.info("Login Test Passed");
			
		}
		else {
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			log.info("Login Test Failed");
		}
	}

}
