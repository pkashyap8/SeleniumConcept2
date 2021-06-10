package com.cyient.upload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadTest {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.id("file_upload")).sendKeys("D:\\Training\\Automation\\java_workspace\\SeleniumConcept2\\src\\files\\profile.pdf");
		

	}

}
