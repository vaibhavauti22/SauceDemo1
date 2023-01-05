package com.SauceDemo.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_LogoutPage {
	WebDriver driver ; 

	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement settingBtn;
	
	public void clickSettingBtn()
	{
		settingBtn.click();
	}
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	WebElement logOutBtn;
	
	public void clickLogOutBtn()
	{
		logOutBtn.click();
	}
   
	   public Pom_LogoutPage(WebDriver driver)
	   {
		   this.driver = driver;
	        PageFactory.initElements(driver,this);
	   
}}
