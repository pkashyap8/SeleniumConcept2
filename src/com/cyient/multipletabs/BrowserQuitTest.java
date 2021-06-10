package com.cyient.multipletabs;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserQuitTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://www.online.citibank.co.in/");
		
		driver.findElement(By.linkText("APPLY FOR CREDIT CARDS")).click();
		
		Set<String> tabSessions=driver.getWindowHandles();
		
		for(String tabSession :tabSessions) {
			driver.switchTo().window(tabSession);
			String currentTitle = driver.getTitle();
			if(currentTitle.equals("Citibank India")) {
				break;
			}
			
		}
		
		driver.findElement(By.linkText("Travel")).click();
		
		driver.findElement(By.id("Email_Id")).sendKeys("praveen@gmail.com");
		//Thread.sleep(5000);
		
		//String actualTitle=driver.getTitle();
		//System.out.println(actualTitle);
		
		//driver.close();//close the current tab //tab1
		//driver.quit(); //close the browser and kill the process

	}

}
