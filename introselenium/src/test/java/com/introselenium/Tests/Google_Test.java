package com.introselenium.Tests;

import com.introselenium.Google_page;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Google_Test {
	
	public WebDriver driver;
	Google_page googlepage; //Se puede cambiar a cualquier otra página. Conviene respetar el formato
	
	@BeforeTest
	public void setUp() throws Exception {
		googlepage = new Google_page(driver);
		driver = googlepage.chromeDriverConnection();
		driver.manage().window().maximize();
		googlepage.visit("https://www.google.com");
			
	}

	@Test
	public void test() throws InterruptedException {
		googlepage.SearchInGoogle();
	}
	

	@AfterTest
	public void tearDown() throws Exception {
		driver.quit();
	}	
	
}