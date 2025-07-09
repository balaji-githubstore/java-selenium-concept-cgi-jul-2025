package com.cgi.tabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1DB4free {

	public static void main(String[] args) {
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://www.db4free.net/");
			
			
			//click on phpMyAdmin »
			//b[contains(text(),'php')]
			driver.findElement(By.partialLinkText("phpMyAdmin")).click();
			
			//switch to second tab 
			ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
			System.out.println(windows);
			
			System.out.println(windows.get(0));
			System.out.println(windows.get(1));
	}

}
