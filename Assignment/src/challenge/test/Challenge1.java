package challenge.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import challenge.pages.AddRepository;
import challenge.pages.InitialSetup;
import challenge.pages.Login;

public class Challenge1 extends InitialSetup {
	@Test
	@Parameters({ "username", "password" })
	public static void LoginPageTest(String username, String password) {
		Login.openLoginPage();
		Login.enterCredentials(username, password);
		Assert.assertEquals(wb.getCurrentUrl(), "https://github.com/");
	}

	@Test
	@Parameters({ "repoName" })
	public static void addRepositoryTest(String repoName) {
		AddRepository.addRepo(repoName);
		Assert.assertEquals(wb.findElement(By.xpath("//a[@data-pjax='#js-repo-pjax-container']")).getText(), repoName);
	}

}
