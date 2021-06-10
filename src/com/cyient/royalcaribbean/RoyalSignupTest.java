package com.cyient.royalcaribbean;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoyalSignupTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://www.royalcaribbean.com/account/create");
		driver.findElement(By.xpath("//input[@data-placeholder='First name/Given name']")).sendKeys("Dennis");
		driver.findElement(By.xpath("//input[@data-placeholder='Last name/Surname']")).sendKeys("Rice");
		
		driver.findElement(By.xpath("//span[contains(text(),'Month')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'April')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Day')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),' 4 ')]")).click();
		
		driver.findElement(By.xpath("//input[@data-placeholder='Year']")).sendKeys("2000");
		
		//Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Country/Region of residence')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[(text()=' India ')]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@data-placeholder='Email address']")).sendKeys("praveen@gmail.com");
		driver.findElement(By.xpath("//input[@data-placeholder='Create new password']")).sendKeys("Praveen123@");
		
		//driver.findElement(By.xpath("//span[text()='Select one security question']")).click();
		
		//driver.findElement(By.xpath("//span[text()=' What was your first car's make or model? ']")).click();
		
		driver.findElement(By.xpath("//input[@data-placeholder='Answer']")).sendKeys("ABC");
		driver.findElement(By.xpath("//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']")).click();
	}

}
