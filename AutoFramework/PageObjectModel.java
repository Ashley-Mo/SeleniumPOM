package AutoFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import pageObjects.LoginPage;

public class PageObjectModel {

	public static void main(String[] args) {

		System.setProperty("webdriver.firefox.marionette", "C:/Users/serajendran/Downloads/geckodriver-0.10.0 (1)");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);

		WebDriver driver = new FirefoxDriver(capabilities);

		driver = new FirefoxDriver();

		driver.get("http://store.demoqa.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("account"));

		LoginPage.UserName(driver).sendKeys("testuser_1");

		LoginPage.PassWord(driver).sendKeys("Test@123");

		LoginPage.login(driver).click();

		driver.quit();
	}

}
