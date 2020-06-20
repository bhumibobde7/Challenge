package challenge.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import challenge.pages.DeleteRepository;

public class Challenge5 {
	@Test
	@Parameters({ "username", "repoName" })
	public static void deleteRepositoryTest(String username, String repoName) {
		DeleteRepository.deleteRepo(username, repoName);
	}
}
