package com.introselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Ejer4_Page extends Base {

    public Ejer4_Page(WebDriver driver) {
        super(driver);
    }

    By buttonLog = By.xpath("//*[@id='loginBTN']");
    By titlePage = By.xpath("//title[contains(text(),'Forms Page')]");
    By loremHeader = By.xpath("//a[contains(text(),'Lorem Ipsum')]");
    By testFormHeader = By.xpath("//a[contains(text(),'Testing Forms')]");
    By footerPage = By.xpath("//*[@id='footerbox']/small");
    By userInput = By.xpath("//*[@id='username']");
    By passInput = By.xpath("//*[@id='password']");
    By continueLog = By.xpath("//button[contains(text(),'Continue')]");
    By logOutButton = By.xpath("//*[@id='logoutBTN']");
    By welcUser = By.xpath("//*[@id='profileTXT']");
    By avatarLogIn = By.xpath("//*[@id='profileIMG']");
    By logInButton = By.xpath("//*[@id='loginBTN']");

    //SELECTORES FORMULARIO
    By firstNameU = By.xpath("//*[@id='TXTUser']");
    By lastNameU = By.xpath("//*[@id='TXTPass']");
    By nickNameU = By.xpath("//*[@id='TXTNick']");
    By eMailU = By.xpath("//*[@id='TXTEmail']");
    By personalSiteU = By.xpath("//*[@id='TXTUrl']");
    By mobileNumU = By.xpath("//*[@id='TXTMobile']");
    By personalTitleU = By.xpath("//*[@id='SELTitle']");
    By somethingAboutU = By.xpath("//*[@id='TXTAbout']");
    By develLabelU = By.xpath("//*[@id='LBLDevNo']");
    By develU = By.xpath("//*[@id='RADButDevNo']");
    By submitForm = By.xpath("//*[@id='BTNSubmit']");

    //SELECTORES TEXT RESULTS
    By tituloPagina = By.xpath("//title[contains(text(),'Results Page')]");
    By persTitle = By.xpath("//*[@id='Title']");
    By firstName = By.xpath("//*[@id='FirstName']");
    By lastName = By.xpath("//*[@id='LastName']");
    By nickName = By.xpath("//*[@id='NickName']");
    By devel = By.xpath("//*[@id='Developer']");
    By mobileNum = By.xpath("//*[@id='Mobile']");
    By emAil = By.xpath("//*[@id='Email']");
    By someAbout = By.xpath("//*[@id='About']");
    By perSite = By.xpath("//*[@id='Url']");

    //VARIABLES DE DATOS
    String fName = "Maria";
    String lName = "Lopez";
    String nName = "Mari";
    String eMail = "marialopez@gmail.com";
    String pSite = "www.marilopez.com";
    String mobNum ="2235751177";
    String perTl = "Miss.";
    String saYou = "Vivo en Buenos Aires y estudio Ciencia de Datos";

    public void headerOk() {
        WaitForElement(loremHeader);
        String loremHe = getText(loremHeader);
        Assert.assertTrue(loremHe.equals("Lorem Ipsum"));

        WaitForElement(testFormHeader);
        String testForm = getText(testFormHeader);
        Assert.assertTrue(testForm.equals("Testing Forms"));

        WaitForElement(welcUser);
        String welcomeUse = getText(welcUser);
        Assert.assertTrue(welcomeUse.equals("Welcome eugenialeone.m !"));

        WaitForElement(logOutButton);
    }

    public void validateFooter() {
        WaitForElement(footerPage);
        String footerPa = getText(footerPage);
        Assert.assertTrue(footerPa.equals("Disclaimer: This project is a personal site meant to be used as a help test site to be able to perform some automation test on demand."));
    }

    public void logValidCred() {
        click(buttonLog);
        WaitForElement(userInput);
        type("eugenialeone.m@hotmail.com", userInput);
        WaitForElement(passInput);
        type("Abcd1234*", passInput);
        click(continueLog);
    }

    public void titlePag() {
        WaitForElement(titlePage);
        String tituloPage = driver.getTitle();
        Assert.assertTrue(tituloPage.equals("Forms Page"));
    }

    public void formData() {
        //1st name
        WaitForElement(firstNameU);
        type(fName, firstNameU);

        //last name
        WaitForElement(lastNameU);
        type(lName, lastNameU);

        //Nickname
        WaitForElement(nickNameU);
        type(nName, nickNameU);

        //Email
        WaitForElement(eMailU);
        type(eMail, eMailU);

        //Personal Site
        WaitForElement(personalSiteU);
        type(pSite, personalSiteU);

        //Mobile Number
        WaitForElement(mobileNumU);
        type(mobNum, mobileNumU);

        //Personal Title
        selectDropdown(personalTitleU, perTl);
        
        //Something about you...
        WaitForElement(somethingAboutU);
        type(saYou, somethingAboutU);

        //Are you a Developer?
        checkIfElementisDisplayed(develLabelU);
        click(develU);

    }


    public void submitButton() {
        WaitForElement(submitForm);
        click(submitForm);

    }

    public void tituloPagina() {
        WaitForElement(tituloPagina);
        String tituloPag = driver.getTitle();
        Assert.assertTrue(tituloPag.equals("Result Page"));
        }

    public void comparingData() {
        //Personal Title
        WaitForElement(persTitle);
        String personalTitle = getText(persTitle);
        Assert.assertTrue(personalTitle.equals(perTl));

        //First Name
        WaitForElement(firstName);
        String fstName = getText(firstName);
        Assert.assertTrue(fstName.equals(fName));

        //Last Name
        WaitForElement(lastName);
        String lstName = getText(lastName);
        Assert.assertTrue(lstName.equals(lName));

        //Nickname
        WaitForElement(nickName);
        String nckName = getText(nickName);
        Assert.assertTrue(nckName.equals(nName));

        //Developer?
        WaitForElement(devel);
        String devs = getText(devel);
        Assert.assertTrue(devs.equals("No"));

        //Mobile Number
        WaitForElement(mobileNum);
        String mobiNum = getText(mobileNum);
        Assert.assertTrue(mobiNum.equals(mobNum));

        //Email
        WaitForElement(emAil);
        String mAil = getText(emAil);
        Assert.assertTrue(mAil.equals(eMail));

        //Something about
        WaitForElement(someAbout);
        String sAbout = getText(someAbout);
        Assert.assertTrue(sAbout.equals(saYou));

        //Personal Site
        WaitForElement(perSite);
        String persUrl = getText(perSite);
        Assert.assertTrue(persUrl.equals(pSite));

    }

    public void logOutCheck() {
        click(logOutButton);

        WaitForElement(welcUser);
        String welcomeUse = getText(welcUser);
        Assert.assertTrue(welcomeUse.equals("Welcome eugenialeone.m !"));

        WaitForElement(avatarLogIn);

        WaitForElement(logOutButton);

        WaitForElement(logInButton);
    }



}
