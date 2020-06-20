package challenge.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteRepository extends InitialSetup {
	static WebDriverWait wait = new WebDriverWait(wb, 30);

	public static void deleteRepo(String username, String repoName) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='octicon octicon-gear']")));
		wb.findElement(By.xpath("//*[@class='octicon octicon-gear']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wb.findElement(By.xpath("//*[contains(text(),'Delete this repository')]")).click();
		wb.findElement(By.xpath(
				"//*[@aria-label='Type in the name of the repository to confirm that you want to delete this repository.']"))
				.sendKeys(username + "/" + repoName);
		wb.findElement(By.xpath("//button[contains(text(),'I understand the consequences, delete this repository')]"))
				.click();
		//Assert.assertEquals(wb.getCurrentUrl(), "https://github.com/");
	}
}
