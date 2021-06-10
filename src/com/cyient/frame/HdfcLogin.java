package com.cyient.frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcLogin {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.186238057.1761334968.1622631692-962760178.1619369102");
		
		driver.switchTo().frame("login_page");
		driver.findElement(By.name("fldLoginUserId")).sendKeys("test123");
		driver.findElement(By.xpath("//img[@alt='continue']")).click();
		
		driver.switchTo().defaultContent();// come out to frame to main HTML

	}

}
