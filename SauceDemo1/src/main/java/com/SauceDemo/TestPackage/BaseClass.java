package com.SauceDemo.TestPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.UtilityPackage.UtilityClass;

public class BaseClass {
	 static WebDriver driver;
	 
	 Logger log = Logger.getLogger("SauceDemo1");
	 
     @Parameters("browserName")
	 @BeforeClass
	 public void setup() throws IOException
	 {
//	if(browserName.equals("chrome"))
//	{
		
	
		 System.setProperty("webdriver.chrome.driver", 
					"D:\\selenium\\chrome file\\chromedriver.exe");
					driver = new ChromeDriver();
PropertyConfigurator.configure("log4j.properties");

			log.info("browser is opened");
					
			driver.manage().window().maximize();	
			log.info("browser is maximized");
					
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("https://www.saucedemo.com/");
			log.info("url is opened");
			
			//screenshot
			 UtilityClass.screenShotMethod(driver,"LoginVaibhav");
	 }		
	  @BeforeMethod 
	  public void loginsetup() throws IOException
	  {
		  
			com.SauceDemo.POMPackage.Pom_loginPage lp = new com.SauceDemo.POMPackage.Pom_loginPage(driver);
			lp.sendUsername();
			log.info("username is entered");
			
			lp.sendPassword();
			log.info("password eneterd");
			
			lp.clickloginBtn();
			log.info("clicked on login button");
			
			//--homePage--//
			log.info("Went on HomePage");
			
			//screenshot
			UtilityClass.screenShotMethod(driver, "VaibhavHome");
			
		}
	   @AfterMethod
	   
	   public void logoutsetup() throws IOException
	   {

			com.SauceDemo.POMPackage.Pom_LogoutPage hp = new com.SauceDemo.POMPackage.Pom_LogoutPage(driver);
			//settingBtn
			hp.clickSettingBtn();
			log.info("Clicked on Setting Btn");
			
			//logOutBtn
			hp.clickLogOutBtn();
			log.info("Clicked on LogOut btn");
			
			//loginPage
			log.info("went on login page");
			
			UtilityClass.screenShotMethod(driver,"LoginVaibhav");
	   }
	   @AfterClass
	   public void tearDown()
	 {
		 driver.quit();
		 log.info("browser is closed");	
		 log.info("End of Program");
		}
}
