package com.selenium.practical;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrawserLaunch {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shubhra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		
   
 /*    System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
     FirefoxDriver driver1=new FirefoxDriver();
     driver1.get("https://www.amazon.com");
     
     System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//Drivers//IEDriverServer.exe");
     InternetExplorerDriver driver2=new InternetExplorerDriver();
     driver2.get("https://www.flipkart.com");*/
	}

}
