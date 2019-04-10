package com.selenium.practical;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Basepage {

	
		public static WebDriver driver;
		public static String path="./config.properties";
		
		public static String loadData(String key) throws IOException {
			File file = new File(path);
			FileInputStream fileinput = new FileInputStream(file);
			Properties prop= new Properties();
			prop.load(fileinput);
			return prop.getProperty(key);
			
			
		}
		
		public static void launch(String browser, String url) {
			
		if (browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\shubhra\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			//driver.get("https://www.amazon.com");
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			  System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
			      driver=new FirefoxDriver();
			     //driver1.get("https://www.amazon.com");
		}
		
		else if (browser.equalsIgnoreCase("ie")) {
			   System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//Drivers//IEDriverServer.exe");
			     driver=new InternetExplorerDriver();
			     //driver2.get("https://www.flipkart.com");
		}
		driver.get(url);
	}

}
