package com.qa.testscripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

public class TestBase {
	public static WebDriver driver;
	
	
	@BeforeClass
	public WebDriver setup() {
		System.setProperty("webdriver.chrome.driver", "F:\\testing\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	return driver;
		
	}
	
	
	@AfterClass
	public void tearDown() {
		 driver.close();
	}

}