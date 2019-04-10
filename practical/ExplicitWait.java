package com.selenium.practical;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) 
	{
	//Explicit wait is putting wait on particular element.	
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");
		clickOn(driver, driver.findElement(By.id("u_0_8")), 2000);
		
	}
public static void clickOn(WebDriver driver, WebElement locator,int time )
{
	WebDriverWait wait =new WebDriverWait(driver, time );
	wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
}
}