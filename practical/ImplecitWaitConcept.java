package com.selenium.practical;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplecitWaitConcept {

	public static void main(String[] args) 
	{
		// Implicit wait is applicable for all the elements present in the webpage.
		// there is pageload wait as well which will wait till the page is not completely loaded.
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("book");
		
	
	}

}
