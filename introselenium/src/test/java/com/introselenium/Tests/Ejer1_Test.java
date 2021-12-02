package com.introselenium.Tests;

import com.introselenium.Ejer1_Page;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ejer1_Test {
    
    public WebDriver driver;
	Ejer1_Page ejer1page;


    @BeforeTest
	public void setUp() throws Exception {
		ejer1page = new Ejer1_Page(driver);
		driver = ejer1page.chromeDriverConnection();
		driver.manage().window().maximize();
		ejer1page.visit("https://www.google.com/");
    
}

    @Test
    public void SearchInGoogle() throws InterruptedException {
        ejer1page.isSearchButton();
        ejer1page.seleniumSearchInGoogle();

    }


    @AfterTest
	public void tearDown() throws Exception {
		driver.quit();
	}

}
