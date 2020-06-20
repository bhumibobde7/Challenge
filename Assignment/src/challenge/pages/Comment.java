package challenge.pages;

import org.openqa.selenium.By;

public class Comment extends InitialSetup {
	public static void addComment() {
		wb.findElement(By.id("new_comment_field")).sendKeys("my comment :+1: ");
		wb.findElement(By.xpath("//button[contains(text(),'Comment')]")).click();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
