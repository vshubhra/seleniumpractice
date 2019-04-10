package com.selenium.practical;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandleFrams {

	// there may be a scenario when some elements may be present inside the frame.
	// Browser>>>>>web page>>>>>Frame>>>>elements
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/autocomplete/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("selenium");
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Button")).click();
		
		
		

	}

}
