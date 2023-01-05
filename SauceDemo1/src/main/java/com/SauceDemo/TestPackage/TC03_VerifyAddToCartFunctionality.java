package com.SauceDemo.TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC03_VerifyAddToCartFunctionality extends BaseClass
{
	
	
     @Test(priority=3)
	public void verifyAllproduct()
	{
		com.SauceDemo.POMPackage.Pom_HomePageAll Hp = new  com.SauceDemo.POMPackage.Pom_HomePageAll(driver);

	 Hp.clickAllProduct();
	 log.info("click on all product");
	 log.info("Apply the validation");
	 
	 String expectedProductselection="6";
	 String actualProductSelected =Hp.getTextFromAddToCartBtn();
	 
	 Assert.assertEquals(actualProductSelected,expectedProductselection);
}
}