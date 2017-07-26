package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private static WebElement element = null;

	public static WebElement UserName(WebDriver driver) {
		element = driver.findElement(By.id("log"));
		return element;
	}

	public static WebElement PassWord(WebDriver driver) {
		element = driver.findElement(By.id("pwd"));
		return element;
	}

	public static WebElement login(WebDriver driver) {
		element = driver.findElement(By.id("login"));
		return element;
	}

}
