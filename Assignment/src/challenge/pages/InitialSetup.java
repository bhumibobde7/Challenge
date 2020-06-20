package challenge.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InitialSetup {
	public static WebDriver wb;

	public static WebDriver setDriver() {
		WebDriverManager.firefoxdriver().setup();
		wb = new FirefoxDriver();
		wb.manage().window().maximize();
		return wb;
	}
}
