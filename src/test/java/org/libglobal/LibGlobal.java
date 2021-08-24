package org.libglobal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {

	static WebDriver driver;

	public WebDriver launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public void loadUrl(String url) {
		driver.get(url);
	}

	public void setText(WebElement e, String data) {
		e.sendKeys(data);
	}

	public void btnClick(WebElement element) {
		element.click();
	}

	public void quitBrowser() {
		driver.quit();
	}

	public String getPageUrl() {
		String url = driver.getCurrentUrl();
		return url;

	}

	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void mouseOver(WebElement e) {
		Actions acc = new Actions(driver);
		acc.moveToElement(e).perform();
	}

	public void dragAndDropAction(WebElement src, WebElement des) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(src, des).perform();
	}

	public void selectOptionByIndex(WebElement ele, int index) {
		Select s = new Select(ele);
		s.selectByIndex(index);
	}

}
