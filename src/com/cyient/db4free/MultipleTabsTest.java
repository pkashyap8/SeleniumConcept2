package com.cyient.db4free;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabsTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://www.db4free.net/");
		driver.findElement(By.xpath("//a[@href='/phpMyAdmin']")).click();
		
		Set<String> tabSessions=driver.getWindowHandles();
		
		for(String tabSession : tabSessions) {
			driver.switchTo().window(tabSession);
			String titleForDb = driver.getTitle();
			if(titleForDb.equals("phpMyAdmin")) {
				break;
			}
			 driver.findElement(By.id("input_username")).sendKeys("db123");
			 driver.findElement(By.id("input_password")).sendKeys("test123");
			 driver.findElement(By.id("input_go")).click();
			 
			 String actualText=driver.findElement(By.xpath("(//div[@role='alert'])[3]")).getText();
			 System.out.println("actualText");
			 driver.close();
			 
			 
	}

	}
}