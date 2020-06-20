package challenge.pages;

import org.openqa.selenium.By;

public class AddIssue extends InitialSetup {

	public static void addIssue(String title, String body, String title2, String body2) {
		wb.findElement(By.xpath("//*[@class='octicon octicon-issue-opened']")).click();
		wb.findElement(By.xpath("//span[text()='New issue']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wb.findElement(By.id("issue_title")).sendKeys(title);
		wb.findElement(By.id("issue_body")).sendKeys(body);
		wb.findElement(By.xpath("//button[contains(text(),'Submit new issue')]")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		String link = wb.getCurrentUrl();
		wb.findElement(By.xpath("//*[@class='octicon octicon-issue-opened']")).click();
		wb.findElement(By.xpath("//span[text()='New issue']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wb.findElement(By.id("issue_title")).sendKeys(title2);
		wb.findElement(By.id("issue_body")).sendKeys(body2);
		wb.findElement(By.id("issue_body")).sendKeys(link);
		wb.findElement(By.xpath("//button[contains(text(),'Submit new issue')]")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
