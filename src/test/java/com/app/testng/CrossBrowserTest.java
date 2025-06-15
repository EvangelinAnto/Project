package com.app.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTest {
	@Parameters({"searchengine"})
	@Test
	public void browserCode(String browser) {
		if(browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
		} else if(browser.equals("Edge")) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.get("https://www.facebook.com/");
		}	
	}

}
