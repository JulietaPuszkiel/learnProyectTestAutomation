package com.introselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AutoTest_page extends Base {

    public AutoTest_page(WebDriver driver) {
        super(driver);
    }

    //SELECTORES
    By titlePage = By.xpath("//title[contains(text(),'Homme Page')]");
    By buttonLog = By.xpath("//*[@id='loginBTN']");
    By hyperLink = By.xpath("//*[@id='alert-trigger']"); //link sólo presente en pantalla para logueo. Esq sup der
    By welcomeMes = By.xpath("//*[@id='notLoggedTitleTXT']");
    By pleaseClickLog = By.xpath("//*[@id='notLoggedScreen']");
    By footerPage = By.xpath("//*[@id='footerbox']");
    By userInput = By.xpath("//*[@id='username']");
    By passInput = By.xpath("//*[@id='password']");
    By continueLog = By.xpath("//button[contains(text(),'Continue')]");
    By logOutButton = By.xpath("//*[@id='logoutBTN']");
    By welcUser = By.xpath("//*[@id='profileTXT']/text()[1]");
    By userName = By.xpath("//*[@id='profileTXT']/text()[2]");
    By messageWrong = By.xpath("//*[@id='error-element-password']");
    

    //Busca el título de la página y compara
    public void tituloPagina() {
        WaitForElement(titlePage);
        String tituloPage = driver.getTitle();
        Assert.assertTrue(tituloPage.equals("Home Page"));
    }

    //Ubica el botón de logueo
    public void isLoginButton() {
        findElement(buttonLog);
    }

    //Busca un link en la pantalla principal sin loguearse
    public void isHyperLink() {
        findElement(hyperLink);
    }

    public void bienvenida() {
        WaitForElement(welcomeMes);
        String bienvMes = driver.getTitle();
        Assert.assertTrue(bienvMes.equals("Welcome to my Automation Testing Site"));
    }

    public void pleaseClick() {
        WaitForElement(pleaseClickLog);
        String pleaseLog = driver.getTitle();
        Assert.assertTrue(pleaseLog.equals("Please click Login button to log into the application or sign up!"));
    }

    public void validateFooter() {
        WaitForElement(footerPage);
        String footerPa = driver.getTitle();
        Assert.assertTrue(footerPa.equals("Disclaimer: This project is a personal site meant to be used as a help test site to be able to perform some automation test on demand."));
    }

    public void logEmptyUser() {
        click(buttonLog);
        WaitForElement(userInput);
        type("", userInput);
        WaitForElement(passInput);
        type("Password", passInput);
        click(continueLog);
        clearText(passInput);
    }

    public void logEmptyPass() {
        WaitForElement(userInput);
        type("User123", userInput);
        WaitForElement(passInput);
        type("", passInput);
        click(continueLog);
        clearText(userInput);
    }

    public void logInvalCred() {
        WaitForElement(userInput);
        type("User123", userInput);
        WaitForElement(passInput);
        type("Password", passInput);
        click(continueLog);
        clearText(userInput);
        WaitForElement(messageWrong);
        String messageWr = getText(messageWrong);
        Assert.assertTrue(messageWr.equals("Wrong email or password"));
    }

    public void logValidCred() {
        WaitForElement(userInput);
        type("eugenialeone.m@hotmail.com", userInput);
        WaitForElement(passInput);
        type("Abcd1234*", passInput);
        click(continueLog);
    }

    public void isLogOut() {
        findElement(logOutButton);
    }

    public void isWelcomeUser() {
        WaitForElement(welcUser);
        String welcomeUs = getText(welcUser);
        Assert.assertTrue(welcomeUs.equals("Welcome"));
        WaitForElement(userName);
        String userNameWel = getText(userName);
        Assert.assertTrue(userNameWel.equals("eugenialeone.m"));

    }
    
}
