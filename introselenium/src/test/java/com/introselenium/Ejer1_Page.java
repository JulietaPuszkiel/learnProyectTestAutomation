package com.introselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Ejer1_Page extends Base {

    public Ejer1_Page(WebDriver driver) {
        super(driver);
    }
	By searchGoogle = By.name("q");
    By googleSearchButton = By.xpath("//div[3]/center/input[1]");
    By firstResult = By.xpath("//div/div[1]/a/h3");

    public void isSearchButton() {
        WaitForElement(googleSearchButton);
        }

	public void seleniumSearchInGoogle() {
		click(searchGoogle);
		type("Selenium", searchGoogle);
        click(firstResult);
			
		}

}
