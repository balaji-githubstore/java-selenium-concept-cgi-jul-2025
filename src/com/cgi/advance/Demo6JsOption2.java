package com.cgi.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo6JsOption2 {

	public static void main(String[] args) {
		
		//per-settings to the browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		
		
		WebDriver driver=new ChromeDriver(options);
		
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.malaysiaairlines.com/us/en/home.html");
		
		driver.findElement(By.xpath("//span[text()='Accept all cookies']")).click();
		
		//approach 1 - not working
		//driver.findElement(By.xpath("//div[@id='book-flight']//input[@name='dateDeparture']")).sendKeys("05 Aug 2025");
		
		//approach 2 - automate calendar
		
		//javascript - inject the script - option 1
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		
		WebElement ele1= driver.findElement(By.xpath("//div[@id='book-flight']//input[@name='dateDeparture']"));
		WebElement ele2= driver.findElement(By.xpath("//div[@id='book-flight']//input[@name='dateReturn']"));
		
		js.executeScript("arguments[0].value='25 Aug 2025'",ele1);
			
		js.executeScript("arguments[0].value='25 Sep 2025'",ele2);
		

		//below not recommmended 
		//js.executeScript("arguments[0].value='25 Aug 2025';arguments[1].value='25 Sep 2025'",ele1,ele2);
	}

}
