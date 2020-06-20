package challenge.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import challenge.pages.AddIssue;
import challenge.pages.InitialSetup;

public class Challenge2 extends InitialSetup {
	@Test
	@Parameters({ "title", "body", "title2", "body2" })
	public static void IssueCreation(String title, String body, String title2, String body2) {
		AddIssue.addIssue(title, body, title2, body2);
		Assert.assertEquals(wb.findElement(By.xpath("//span[@class='js-issue-title']")).getText(), title2);
	}
}
