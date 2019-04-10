package com.selenium.practical;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ObjectRepositoryFileUsage {
	static WebDriver driver ;
	
	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\shubhra\\eclipse-workspace\\Selenium\\src\\com\\selenium\\practical\\config.properties");
		prop.load(file);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		
		String Url =prop.getProperty("url");
		System.out.println(prop.getProperty("url"));
		String BrowserName = prop.getProperty("browser");
		System.out.println(prop.getProperty("browser"));
		
      
	}
}
