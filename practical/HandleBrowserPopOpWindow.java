package com.selenium.practical;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserPopOpWindow {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #2")).click();
		Set<String> handlers = driver.getWindowHandles();
		System.out.println(handlers);
		Iterator<String> itr =handlers.iterator();
		String parentID =itr.next();
		System.out.println("parent ID "+ parentID);
		String ChildID =itr.next();
		System.out.println("Child ID "+ ChildID);
		System.out.println("Childwindow Title "+driver.getWindowHandle());
		driver.switchTo().window(ChildID);
		driver.close();
		driver.switchTo().window(parentID);
		
		}
		
	}


