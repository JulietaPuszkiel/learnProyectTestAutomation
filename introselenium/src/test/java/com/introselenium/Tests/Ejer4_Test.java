package com.introselenium.Tests;
import com.introselenium.Ejer4_Page;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ejer4_Test {

    public WebDriver driver;
	Ejer4_Page ejer4page;

    @BeforeTest
	public void setUp() throws Exception {
		ejer4page = new Ejer4_Page(driver);
		driver = ejer4page.chromeDriverConnection();
		driver.manage().window().maximize();
		ejer4page.visit("https://testappautomation.herokuapp.com/forms/");
			
	}


    @Test
    //Parte 1: Loguearse, validar header y footer
    public void part1() throws InterruptedException{
        ejer4page.logValidCred();
        ejer4page.headerOk();
        ejer4page.validateFooter();
    }

    @Test
    //Parte 2: Validar título de la página
    public void part2() throws InterruptedException{
        ejer4page.titlePag();
    }

    @Test
    //Parte 3: Llenar el formulario (SIN SUBMIT)
    public void part3() throws InterruptedException{
        ejer4page.formData();
    }

    @Test
    //Parte 4: Clickear en "Submit"
    public void part4() throws InterruptedException{
        ejer4page.submitButton();

    }

    @Test
    /*Parte 5: Después de validar el formulario completo:
    -validar el título de pág "Result Page"
    -Todos los datos previamente ingresados*/
    public void part5() throws InterruptedException{
        ejer4page.tituloPagina();
        ejer4page.comparingData();

    }

    @Test
    /*Parte 6: Clickear en "Log Out"
    -Verificar que sea redirigido a Home Page
    -Verificar que no estén el mensaje de bienvenida ni el logo
    -Verificar que esté el botón "Log In"*/
    public void part6() throws InterruptedException{
        ejer4page.logOutCheck();

    }







    @AfterTest
	public void tearDown() throws Exception {
		driver.quit();
	}
    
    
}
