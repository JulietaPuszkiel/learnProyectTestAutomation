package com.introselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Ejer3_page extends Base {


    public Ejer3_page(WebDriver driver) {
        super(driver);
    }

    //SELECTORES
    By buttonLog = By.xpath("//*[@id='loginBTN']");
    By collapsedTitle = By.className("panel-collapse collapse in");
    By titleSectLorem = By.xpath("//*[contains(text(),'¿Qué es Lorem Ipsum?')]");
    By titleSecPor = By.xpath("//*[contains(text(),'¿Por qué lo usamos?')]");
    By titleSecDe = By.xpath("//*[contains(text(),'¿De dónde viene?')]");
    By titleSectDonde = By.xpath("//*[contains(text(),'¿Dónde puedo conseguirlo?')]");
    By titlePage = By.xpath("//title[contains(text(),'Lorem Ipsum Page')]");
    By loremHeader = By.xpath("//a[contains(text(),'Lorem Ipsum')]");
    By testFormHeader = By.xpath("//a[contains(text(),'Testing Forms')]");
    By hiddenText = By.xpath("//*[@id='hiddenText1']");
    By footerPage = By.xpath("//*[@id='footerbox']/small");
    By userInput = By.xpath("//*[@id='username']");
    By passInput = By.xpath("//*[@id='password']");
    By continueLog = By.xpath("//button[contains(text(),'Continue')]");
    By logOutButton = By.xpath("//*[@id='logoutBTN']");
    By welcUser = By.xpath("//*[@id='profileTXT']");
    By newsAd = By.xpath("//*[@id='news']");
    By watchVideo = By.xpath("//a[contains(text(),'Watch Videos')]");
    By postSomething = By.xpath("//a[contains(text(),'Post Something')]");
    By automateItSel = By.xpath("//a[contains(text(),'Automate It!')]");
    

    //Busca en el header los elementos
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

    public void hiddentextMethod() {
        WaitForElement(hiddenText);
        String hiddentexto = getAttribute(hiddenText, "h1");
        Assert.assertTrue(hiddentexto.equals("Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..."));
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

    public void news() {
        WaitForElement(newsAd);
        String newAd = getText(newsAd);
        Assert.assertTrue(newAd.equals("Notice: This is a testing site meant to be used for automation test trainings"));
    }

    public void titlePag() {
        WaitForElement(titlePage);
        String tituloPage = driver.getTitle();
        Assert.assertTrue(tituloPage.equals("Lorem Ipsum Page"));
    }

    public void validateLoremSection() {
        WaitForElement(titleSectLorem);
        String titleSectLor = getText(titleSectLorem);
        Assert.assertTrue(titleSectLor.equals("¿Qué es Lorem Ipsum?"));
    }

    public void validatePorSection() {
        WaitForElement(titleSecPor);
        String titleSectPor = getText(titleSecPor);
        Assert.assertTrue(titleSectPor.equals("¿Por qué lo usamos?"));
    }

    public void validateDeSection() {
        WaitForElement(titleSecDe);
        String titleSectDe = getText(titleSecDe);
        Assert.assertTrue(titleSectDe.equals("¿De dónde viene?"));
    }

    public void validateDondeSection() {
        WaitForElement(titleSectDonde);
        String titleSectDo = getText(titleSectDonde);
        Assert.assertTrue(titleSectDo.equals("¿Dónde puedo conseguirlo?"));
    }
    
    public void youtubeValidation() {
        WaitForElement(watchVideo);
        String ytAttribute = getAttribute(watchVideo,"target");
        Assert.assertTrue(ytAttribute.equals("_self"));
    }

    public void facebookValidation() {
        WaitForElement(postSomething);
        String fbAttribute = getAttribute(postSomething, "target");
        Assert.assertTrue(fbAttribute.equals("_self"));
    }

    public void seleniumValidation() {
        WaitForElement(automateItSel);
        String slAttribute = getAttribute(automateItSel, "target");
        Assert.assertTrue(slAttribute.equals("_self"));
    }
}