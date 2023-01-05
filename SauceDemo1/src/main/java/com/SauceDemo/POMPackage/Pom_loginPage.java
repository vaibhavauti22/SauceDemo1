package com.SauceDemo.POMPackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_loginPage {
	 
		WebDriver driver ; 
		
		@FindBy(xpath="//input[@id='user-name']")
		WebElement Username;
		
		@FindBy(xpath="//input[@id='password']")
		WebElement Password;
		
		@FindBy(xpath="//input[@id='login-button']")
		WebElement loginBtn;
		
		public void sendUsername()
		{
			Username.sendKeys("standard_user");
		}
	   public void sendPassword()
	   {
		   Password.sendKeys("secret_sauce");
	   }
	   public void clickloginBtn()
	   {
		   loginBtn.click();
	   }
	   
		   public Pom_loginPage(WebDriver driver)
		   {
			   this.driver = driver;
		        PageFactory.initElements(driver,this);
		   
	
	}

}
