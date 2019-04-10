package com.selenium.practical;



import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {

	public static void main(String[] args) throws MalformedURLException, IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");	
		List<WebElement> list = driver.findElements(By.tagName("a"));
		list.addAll(driver.findElements(By.tagName("img")));
		System.out.println("All links and Images count "+" = "+list.size());
		
		
		List<WebElement>activelink = new ArrayList<WebElement>();
		for (int i=0;i<list.size();i++)
		{
		 System.out.println(list.get(i).getAttribute("href"));
		if(list.get(i).getAttribute("href")!=null) {
			activelink.add(list.get(i));
			
			System.out.println("Active links and Images count "+" = "+activelink.size()); 
			for(int j=0; i<activelink.size();j++)
			{
				HttpURLConnection activeURL =	(HttpURLConnection)new URL(activelink.get(j).getAttribute("href")).openConnection();
				activeURL.connect();
				String response =activeURL.getResponseMessage();
				activeURL.disconnect();
				System.out.println(activelink.get(j).getAttribute("href")+" "+response);
			}
		 }
		}
		
		}

}
