package com.app.baseclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver = null;
	public static Select s;
	public static Actions a;
	public static WebDriverWait wait;


	@BeforeClass
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		
	}
	public static void passData(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void clearData(WebElement element) {
		element.clear();

	}

	public static void clickElement1(WebElement element) {
		element.click();

	}

	public static void radioButtonClick(WebElement element) {
		element.click();

	}

	public static void checkBoxClick(WebElement element) {
		element.click();

	}

	public static void browserClose() {
		driver.close();

	}

	public static void browserQuit() {
		driver.quit();

	}

	public static void readPageTitle() {
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
	}

	public static void readPageUrl() {
		String pageUrl = driver.getCurrentUrl();
		System.out.println("Page url is: " + pageUrl);
	}

	public static void pageSource() {
		String pageSource = driver.getPageSource();
		System.out.println("Page url is: " + pageSource);
	}

	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static void navigateForward() {
		driver.navigate().forward();
	}

	public static void navigateRefresh() {
		driver.navigate().refresh();

	}

	public static void sleepThread(long sleepValue) throws InterruptedException {
		Thread.sleep(sleepValue);
	}

	public static void pullData(WebElement element) {
		String text = element.getText();
		System.out.println("Data pulled from page: " + text);
	}

	public static void pullDataFromUiField(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println("Pulled data from ui field is: " + attribute);
	}

	public static void isCategoryOfCheckBox(WebElement element) {
		boolean data = element.isDisplayed();
		System.out.println("Displayed info:" + data);
		boolean data1 = element.isEnabled();
		System.out.println("Enabled info:" + data1);
		element.isSelected();
		boolean data2 = element.isSelected();
		System.out.println("Selected info:" + data2);

	}

	public static void simpleAlert() {
		Alert d = driver.switchTo().alert();
		d.accept();

	}

	public static void confirmAlertPositive() {
		Alert d = driver.switchTo().alert();
		d.accept();

	}

	public static void confirmAlertNegative() {
		Alert d = driver.switchTo().alert();
		d.dismiss();

	}

	public static void promptAlertPositive(String data) {
		Alert d = driver.switchTo().alert();
		d.sendKeys(data);
		d.accept();

	}

	public static void promptAlertNegative(String data) {
		Alert d = driver.switchTo().alert();
		d.sendKeys(data);
		d.dismiss();

	}

	public static void isMultipleCheck() {
		boolean multiple = s.isMultiple();
		System.out.println("Is multiple: " + multiple);
	}

	public static void deSelectAllOption() {
		s.deselectAll();
	}

	public static void printAllSelectionOptions() {
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement values : allSelectedOptions) {
			System.out.println("Printing all select options:" + values.getText());
		}
	}

	public static void printFirstSelectOption() {
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println("First Selected Option:" + firstSelectedOption.getText());
	}

	public static void selectByValue(String data) {
		s.selectByValue(data);
	}

	public static void selectByIndex(int data) {
		s.selectByIndex(data);
	}

	public static void selectByVisibleData(String data) {
		s.selectByVisibleText(data);

	}

	public static void deselectByValue(String data) {
		s.deselectByValue(data);
	}

	public static void deselectByIndex(int data) {
		s.deselectByIndex(data);
	}

	public static void deselectByVisibleData(String data) {
		s.deselectByVisibleText(data);

	}

	public void Actionclick(WebElement element) {
		a.click(element).perform();
	}

	public void contextClick(WebElement element) {
		a.contextClick(element).perform();
	}

	public void doubleClick(WebElement element) {
		a.doubleClick(element).perform();
	}

	public void moveToElement(WebElement element) {
		a.moveToElement(element).perform();
	}

	public void dragAndDrop(WebElement source, WebElement destination) {
		a.dragAndDrop(source, destination).perform();
	}

	@AfterClass
	public static void takeScreenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		Date date = new Date();
		File destination = new File("C:\\Users\\HP\\eclipse-workspace\\Develop\\new\\Jan_2025_New\\reports_screenshots"  + date + ".png");
		FileHandler.copy(source, destination);
		driver.close();
	}

	public static void setAttribute(WebElement element, String attribute, String value) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);", element, attribute, value);
        System.out.println("Attribute " + attribute + " set to " + value);
	}
	public static String getAttribute(WebElement element, String attribute) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String value = (String) js.executeScript("return arguments[0].getAttribute(arguments[1]);", element, attribute);
		System.out.println("Attribute " + attribute + " value: " + value);
		return value;
	}

	public static void clickElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
		System.out.println("Element clicked using JavaScriptExecutor");
	}

	public static void scrollToView(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		System.out.println("Scrolled to the element using JavaScriptExecutor");
	}

	public static String getWebTableCellData(int row, int column) {
		WebElement table = driver.findElement(By.tagName("table"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		WebElement cell = rows.get(row - 1).findElements(By.tagName("td")).get(column - 1);
		return cell.getText();
	}

	public static void getWebTableData() {
		WebElement table = driver.findElement(By.tagName("table"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));

		for (WebElement row : rows) {
			List<WebElement> cells = row.findElements(By.tagName("td"));
			for (WebElement cell : cells) {
				System.out.print(cell.getText() + " | ");
			}
			System.out.println();
		}
	}

	public static void switchToWindow(String windowTitle) {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String handle : windowHandles) {
			driver.switchTo().window(handle);
			if (driver.getTitle().equals(windowTitle)) {
				System.out.println("Switched to window with title: " + windowTitle);
				break;
			}
		}
	}

	public static void switchToFrameByIndex(int index) {
		driver.switchTo().frame(index);
		System.out.println("Switched to frame with index: " + index);
	}

	public static void switchToFrameByID(String frameID) {
		driver.switchTo().frame(frameID);
		System.out.println("Switched to frame with ID: " + frameID);
	}

	public static void switchToFrameByElement(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
		System.out.println("Switched to frame with WebElement");
	}

	public static void switchToDefaultContent() {
		driver.switchTo().defaultContent();
		System.out.println("Switched to default content");
	}

	public static void waitForElementToBeClickable(WebElement element, Duration timeout) {
		wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		System.out.println("Element is clickable");
	}

	public static void waitForElementToBeVisible(WebElement element, Duration timeout) {
		wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
		System.out.println("Element is visible");
	}

	public static void setImplicitWait(int timeout) {
		driver.manage().timeouts().implicitlyWait(timeout, java.util.concurrent.TimeUnit.SECONDS);
		System.out.println("Implicit wait set to: " + timeout + " seconds");
	}

	public static void waitForPageToLoad(Duration timeout) {
		wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.jsReturnsValue("return document.readyState=='complete'"));
		System.out.println("Page is loaded");
	}


}
