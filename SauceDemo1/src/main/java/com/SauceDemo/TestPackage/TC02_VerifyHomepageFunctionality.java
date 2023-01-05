package com.SauceDemo.TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TC02_VerifyHomepageFunctionality extends BaseClass
{	

	
	@Test(priority=2)
	public void verify_addToCart()
	{

		 com.SauceDemo.POMPackage.PomClass_HomePageAdd1 Hp = new  com.SauceDemo.POMPackage.PomClass_HomePageAdd1(driver);
			Hp.clickBagProduct();
		 String expectedProductselection="1";
		 String actualProductSelected = Hp.getTextFromAddToCartBtn();
		 
		 Assert.assertEquals(actualProductSelected,expectedProductselection );

	

}
}