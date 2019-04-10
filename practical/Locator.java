package com.selenium.practical;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	
	// Locators are the internal properties of a element through which we selenium identify the element on the webpage.
	// type: ID, name, classname, linktext( partial linktext), Xpath, CSS-Selectors, tag name.
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		

	}

}
