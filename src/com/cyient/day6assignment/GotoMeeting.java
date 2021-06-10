package com.cyient.day6assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GotoMeeting {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("https://www.gotomeeting.com/en-in");
		
		driver.findElement(By.id("truste-consent-close")).click();
		driver.findElement(By.xpath("//div[@ class='conversion-modal__close']")).click();
		driver.findElement(By.linkText("Start for Free")).click();
		driver.findElement(By.xpath("//img[@alt='close icon']")).click();
		driver.findElement(By.id("first-name")).sendKeys("Praveen");
		driver.findElement(By.id("last-name")).sendKeys("Kashyap");
		driver.findElement(By.id("login__email")).sendKeys("kashyap@gmail.com");
		driver.findElement(By.id("contact-number")).sendKeys("9999999999");
		
		Select jobTitle=new Select(driver.findElement(By.id("JobTitle")));
		jobTitle.selectByValue("Help Desk");
		driver.findElement(By.id("login__password")).sendKeys("Kashyap123#");
		driver.findElement(By.xpath("//input[@ value='10-99' ]")).click();
		driver.findElement(By.xpath("//button[@ data-button='trial-submit']")).click();
		
	}

}
