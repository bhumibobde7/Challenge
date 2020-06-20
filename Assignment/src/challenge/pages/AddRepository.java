package challenge.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddRepository extends InitialSetup {
	static WebDriverWait wait = new WebDriverWait(wb, 30);

	public static void addRepo(String name) {
		wb.findElement(By.xpath("//*[@class='octicon octicon-plus']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/new']")));
		wb.findElement(By.xpath("//a[@href='/new']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("repository_name")));
		wb.findElement(By.id("repository_name")).sendKeys(name);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wb.findElement(By.id("repository_visibility_private")).click();
		wb.findElement(By.xpath("//button[contains(text(),'Create repository')]")).click();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
