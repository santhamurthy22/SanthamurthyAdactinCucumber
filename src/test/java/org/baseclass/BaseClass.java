package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.masterthought.cucumber.json.Row;

public class BaseClass {

	public static WebDriver d;

	public static void lanuchBrowser() {
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
	}
	public static void lanuchUrl(String Url) {
		d.get(Url);
	}
	public static void maxWindow() {
		d.manage().window().maximize();
	}
	public static void searchFill(WebElement element, String text) {
		element.sendKeys(text);
	}		
	public static void btnClick(WebElement element) {
		element.click();
	}
	public static void txtSelect(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	}
