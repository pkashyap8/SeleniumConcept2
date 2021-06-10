package com.cyient.medibuddy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Signup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //it is a implicit conditional wait means no any fix time limit as soon we get responce in browser it get updated.
		
		driver.get("https://www.medibuddy.in/");
		
//		Thread.sleep(10000);  it is a unconditional wait to get response from the Browser
		
		driver.findElement(By.linkText("Signup")).click();
		
	
		
		driver.findElement(By.name("firstName")).sendKeys("Praveen");
		driver.findElement(By.name("phone")).sendKeys("9999999999");
		driver.findElement(By.name("username")).sendKeys("praveen@gmail.com");
		driver.findElement(By.name("password")).sendKeys("abc123");
		driver.findElement(By.xpath("//input[@ng-model='logInUser.isChecked']")).click();
		driver.findElement(By.name("employeeId")).sendKeys("12345");
		
		
		//dropdown
		Select year = new Select(driver.findElement(By.xpath("//select[@ng-model='date.year']")));
        year.selectByVisibleText("1996");
        Select month = new Select(driver.findElement(By.xpath("//select[@ng-model='date.month']")));
        month.selectByVisibleText("06");
        Select date = new Select(driver.findElement(By.xpath("//select[@ng-model='date.day']")));
        date.selectByVisibleText("28");
               
               driver.findElement(By.xpath("//span[text()='Male']")).click();
	}

}
