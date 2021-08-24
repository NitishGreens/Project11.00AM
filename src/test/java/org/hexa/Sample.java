package org.hexa;

import org.libglobal.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample {

	public static void main(String[] args) {

		LibGlobal lib = new LibGlobal();
		// launchbrowser
		WebDriver driver = lib.launchBrowser();

		lib.loadUrl("https://en-gb.facebook.com/");

		String url = lib.getPageUrl();
		System.out.println(url);

		String title = lib.getPageTitle();
		System.out.println(title);

		WebElement txtUserName = driver.findElement(By.id("email"));
		lib.setText(txtUserName, "abu@gmail.com");

		WebElement txtPassword = driver.findElement(By.id("pass"));
		lib.setText(txtPassword, "Hello@123");

		WebElement btnLogin = driver.findElement(By.xpath("//button[@value='1']"));
		lib.btnClick(btnLogin);

		lib.quitBrowser();
	}

}
