package com.cyient.day6assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("sign-in-icon-down")).click();
		driver.findElement(By.id("signInLink")).click();
		
		
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@ class='modalIframe']")));
	
		driver.findElement(By.id("mobileNoInp")).sendKeys("8987767879");
		driver.findElement(By.id("recaptchaElement")).click();
		driver.switchTo().defaultContent();  // come out to frame to main HTML
	}

}
