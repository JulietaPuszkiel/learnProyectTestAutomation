package com.introselenium.Tests;

import com.introselenium.AutoTest_page;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoTest_Test {

    public WebDriver driver;
	AutoTest_page autompage; //Se puede cambiar a cualquier otra página. Conviene respetar el formato
	
	@BeforeTest
	public void setUp() throws Exception {
		autompage = new AutoTest_page(driver);
		driver = autompage.chromeDriverConnection();
		driver.manage().window().maximize();
		autompage.visit("https://testappautomation.herokuapp.com/");
			
	}

	@Test
	public void exerciseTwo() throws InterruptedException {
		autompage.tituloPagina();
        autompage.isLoginButton();
        autompage.isHyperLink();
		autompage.bienvenida();
		autompage.pleaseClick();
        
	}

	@Test
	public void exerciseThree() throws InterruptedException {
		autompage.validateFooter();
        
	}

	@Test
	public void exerciseFour() throws InterruptedException {
		autompage.logEmptyUser();
		autompage.logEmptyPass();
		autompage.logInvalCred();

        
	}

	@Test
	public void exerciseFive() throws InterruptedException {
		autompage.logValidCred();
        
	}

	@Test
	public void exerciseSix() throws InterruptedException {
		autompage.isWelcomeUser();
		autompage.isLogOut();
        
	}

	@AfterTest
	public void tearDown() throws Exception {
		driver.quit();
	}	
	
}
