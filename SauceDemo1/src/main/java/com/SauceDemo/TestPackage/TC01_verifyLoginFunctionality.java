package com.SauceDemo.TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01_verifyLoginFunctionality  extends BaseClass{
	
		
		@Test(priority=1)
		public void verify_loginFunctionality()
		{
			String givenTitle = "Swag Labs";   		
			String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle,givenTitle);
		}
}

		 
		
