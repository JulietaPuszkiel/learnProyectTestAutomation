package com.introselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Google_page extends Base {

		By searchGoogle = By.name("q");
	
		public Google_page(WebDriver driver) {
		super(driver);
	}

		public void SearchInGoogle() {
			click(searchGoogle);
			type("Hola Mundo", searchGoogle);
			
		}

}
