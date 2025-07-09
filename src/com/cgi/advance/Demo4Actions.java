package com.cgi.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo4Actions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://google.com");
		
		
		Actions actions=new Actions(driver);
		
		actions.click(driver.findElement(By.name("q")))
		.keyDown(Keys.SHIFT).sendKeys("hello world").keyUp(Keys.SHIFT)
		.pause(800)
		.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL)
		.pause(800)
		.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).pause(800)
		.sendKeys(Keys.ENTER)
		.perform();
		
		
		
		
	}
}
