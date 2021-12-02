package com.introselenium.Tests;

import com.introselenium.Ejer3_page;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ejer3_Test {

    public WebDriver driver;
	Ejer3_page ejer3page;

    @BeforeTest
	public void setUp() throws Exception {
		ejer3page = new Ejer3_page(driver);
		driver = ejer3page.chromeDriverConnection();
		driver.manage().window().maximize();
		ejer3page.visit("https://testappautomation.herokuapp.com/lorem");
			
	}
    
    @Test
    //Parte 1: identificar header y footer logueados
    public void part1() throws InterruptedException {
        ejer3page.logValidCred();
        ejer3page.headerOk();
        ejer3page.validateFooter();
    }


    @Test
    //Parte 2: es visible "Notice: This is a testing site meant to be used for automation test trainings". Id: news
    public void part2() throws InterruptedException {
        ejer3page.news();
    }

    @Test
    //Parte 3: Se debe ver el texto oculto "Neque porro quisquam bla bla bla" con el selector ID: hiddenText1
    public void part3() throws InterruptedException {
        ejer3page.hiddentextMethod();
    }

    @Test
    //Parte 4: Título de la página "Lorem Ipsum Page"
    public void part4() throws InterruptedException {
        ejer3page.titlePag();

    }

    @Test
    /*Parte 5: Una vez que tenemos acceso a la página hay que validar las secciones:
    "¿Qué es Lorem Ipsum?"
    "¿Por qué lo usamos"
    "¿De dónde viene?"
    "¿Dónde puedo conseguirlo?"*/
    public void part5() throws InterruptedException {
        ejer3page.validateLoremSection();
        ejer3page.validatePorSection();
        ejer3page.validateDeSection();
        ejer3page.validateDondeSection();

    }

    @Test
    //Parte 6a: Validar que el link a Youtube existe y se abre en la misma página
    public void part6a() throws InterruptedException {
        ejer3page.youtubeValidation();

    }
    @Test
        //Parte 6b: Validar que los links a Selenium y Facebook existen y se abren en la misma página
    public void part6b() throws InterruptedException {
        ejer3page.facebookValidation();
        ejer3page.seleniumValidation();
    }

    @AfterTest
	public void tearDown() throws Exception {
		driver.quit();
	}

}
