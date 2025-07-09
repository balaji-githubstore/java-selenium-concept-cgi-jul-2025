package com.cgi.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3FBRegister {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/");
		
		
		//click on create new account
		driver.findElement(By.linkText("Create new account")).click();
		
		//enter firstname
		driver.findElement(By.name("firstname")).sendKeys("john");
		
		//click on custom radio button
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		//driver.findElement(By.xpath("//label[text()='Custom']")).click();
		
		//20 Dec 2000
		
		Select selectDay=new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("20");
		
		Select selectMonth=new Select(driver.findElement(By.id("month")));
		selectMonth.selectByVisibleText("Dec");
		
		//select year as 2000
		
		//click on submit
		
	}

}
