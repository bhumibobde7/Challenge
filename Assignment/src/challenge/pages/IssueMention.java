package challenge.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class IssueMention extends InitialSetup {
	public static void mentionIssue(String title) throws IOException {

		wb.findElement(By.xpath("//*[@class='octicon octicon-issue-opened']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wb.findElement(By.xpath("//a[text()='" + title + "']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wb.findElement(By.id("new_comment_field")).sendKeys("my new comment #");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wb.findElement(By.id("new_comment_field")).sendKeys(Keys.ENTER);
		wb.findElement(By.xpath("//button[contains(text(),'Comment')]")).click();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String issueId = wb.findElement(By.xpath("//a[@class='issue-link js-issue-link']")).getText();
		System.out.println(issueId);
		wb.findElement(By.xpath("//*[text()='" + issueId + "']")).click();
	}
}
