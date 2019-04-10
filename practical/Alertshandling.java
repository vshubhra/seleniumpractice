package com.selenium.practical;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertshandling {

	// Alerts are Java Script PopUps.
	// These are defined by the developers when u enter.
	// we can't spy the alerts for that we will use the Alerts class and pass the driver in constructor of alert object.
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com");
        driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
        driver.findElement(By.name("proceed")).click();
        Thread.sleep(3000);
       Alert alert= driver.switchTo().alert();
      System.out.println(alert.getText());
     String text= alert.getText();
     String test1= "Please enter a valid user name";
     if (text.equals(test1)) {
    	 System.out.println("Alert ,message is correct");
     }
      alert.accept();
  

	}

}
