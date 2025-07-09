package com.cgi.basics;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4Medibuddy {

	public static void main(String[] args)  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://www.medibuddy.in/"); //wait for pageload to complete
		
		//findElement - checks for presence of given locator in 0.5s 
		driver.findElement(By.linkText("Login")).click();

		
		//findElement - checks for presence of given locator in 0.5s
		driver.findElement(By.id("phone")).sendKeys("34343434");

		String actualText=driver.findElement(By.xpath("//div[contains(text(),'ReclaimYourHealth')]")).getText();
		System.out.println(actualText);
	}

}
