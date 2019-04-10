package com.selenium.practical;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitching {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.hdfcbank.com/");
		
		
		driver.findElement(By.id("container-div")).click();
		
		Thread.sleep(2000);
		driver.getTitle();
		System.out.println(driver.getTitle());
		String parentWindowID= driver.getWindowHandle();
		System.out.println("Parent window ID"+parentWindowID);
		Thread.sleep(5000);
		
		driver.findElement(By.id("loginsubmit")).click();
		
		Set<String> childWindowID= driver.getWindowHandles();
		System.out.println(childWindowID.size());
		//will use the iterator rather than for loop as it is set.
		Iterator<String> itr=childWindowID.iterator();
		
		while (itr.hasNext()) {
			String CurrentWindow =itr.next();
			
			if (!CurrentWindow.equals(parentWindowID))
			{
				driver.switchTo().window(CurrentWindow);
				System.out.println(driver.getTitle());
			}
			
		}
			
		

	}

}
