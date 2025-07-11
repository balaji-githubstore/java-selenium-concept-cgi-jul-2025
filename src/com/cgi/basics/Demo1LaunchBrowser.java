package com.cgi.basics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1LaunchBrowser {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
	
		
		driver.get("https://www.facebook.com/");
		
		//get the actual title and print it
		String actualTitle= driver.getTitle();
		System.out.println(actualTitle);
		
		//get the actual url and print it
	    String actualUrl=driver.getCurrentUrl();
	    System.out.println(actualUrl);
	    
	    String actualSource= driver.getPageSource();
	    System.out.println(actualSource);
	    
	    driver.quit();
	}

}
