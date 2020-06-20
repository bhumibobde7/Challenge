package challenge.test;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import challenge.pages.InitialSetup;
import challenge.pages.IssueMention;

public class Challenge4 extends InitialSetup {
	@Test
	@Parameters({ "title" })
	public static void IssueMentionTest(String title) throws IOException {
		IssueMention.mentionIssue(title);
	}

}
