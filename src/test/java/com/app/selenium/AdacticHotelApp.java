package com.app.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdacticHotelApp extends Selenium{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/"); //id="username"
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys(excelreadformat("Sheet1", 0, 0));
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys(excelreadformat("Sheet1", 1, 0));
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
	}

}
