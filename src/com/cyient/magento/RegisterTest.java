package com.cyient.magento;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://magento.com/");
		driver.findElement(By.id("gnav_557")).click();
		driver.findElement(By.id("register")).click();
		driver.findElement(By.id("firstname")).sendKeys("Praveen");
		driver.findElement(By.id("lastname")).sendKeys("Kashyap");
		driver.findElement(By.id("email_address")).sendKeys("praveen@gmail.com");
		driver.findElement(By.id("self_defined_company")).sendKeys("ABC");
		
		Select myCompanyPrimarily=new Select(driver.findElement(By.id("company_type")));
		myCompanyPrimarily.selectByValue("tech_partner");
		
		Select myRole=new Select(driver.findElement(By.id("individual_role")));
		myRole.selectByValue("technical/developer");
		
		Select country=new Select(driver.findElement(By.id("country")));
		country.selectByValue("IN");
		
		
	}

}
