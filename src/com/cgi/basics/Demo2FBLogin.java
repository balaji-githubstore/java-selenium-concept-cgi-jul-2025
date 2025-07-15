package com.cgi.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FBLogin {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/");


		driver.findElement(By.cssSelector("#email")).sendKeys("hello123232323@gmail.com");
		
		driver.findElement(By.cssSelector("#pass")).sendKeys("welcome1232");
		
		//click on login
		driver.findElement(By.cssSelector("button[name='login']")).click();
		
		//driver.quit();
	}

}
