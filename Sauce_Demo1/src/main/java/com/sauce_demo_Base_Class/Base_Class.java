package com.sauce_demo_Base_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Base_Class {

protected static WebDriver driver;
	
	@BeforeMethod
	public void applicationSetup()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.saucedemo.com/");
		
		
		
		WebDriverWait wait=new WebDriverWait(driver,30);
	}
	
	@AfterMethod
	public void applicationClose()
	{
		driver.quit();
		
		
	}
}
