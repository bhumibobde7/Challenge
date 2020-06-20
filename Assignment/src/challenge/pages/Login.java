package challenge.pages;

import org.openqa.selenium.By;

public class Login extends InitialSetup {

	public static void openLoginPage() {
		setDriver();
		wb.get("https://github.com/login");
	}
	public static void enterCredentials(String username,String password) {
		wb.findElement(By.id("login_field")).sendKeys(username);
		wb.findElement(By.id("password")).sendKeys(password);
		wb.findElement(By.name("commit")).click();
	}
}
