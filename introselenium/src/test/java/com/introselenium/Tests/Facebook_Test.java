package com.introselenium.Tests;

import com.introselenium.Facebook_page;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebook_Test {

	public WebDriver driver;
	Facebook_page facebookpage;
	
	@BeforeTest
	public void setUp() throws Exception {
		facebookpage = new Facebook_page(driver);
		driver = facebookpage.chromeDriverConnection();
		driver.manage().window().maximize();
		facebookpage.visit("https://www.facebook.com/");
			
	}

	@Test
	public void test() throws InterruptedException {
		facebookpage.facebookLogin();
		//facebookpage.tituloPagina();

	}
	

	@AfterTest
	public void tearDown() throws Exception {
		driver.quit();
	}	
	



    
}
