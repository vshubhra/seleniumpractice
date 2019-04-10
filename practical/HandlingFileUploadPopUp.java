package com.selenium.practical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileUploadPopUp {

	public static void main(String[] args)
	{
		//selenium can not handle the window screen so we need to use sendkeys rather than click as click operation will take u to the window.
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
        driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\shubhra\\Desktop\\Loadrunner.txt");
	}

}

