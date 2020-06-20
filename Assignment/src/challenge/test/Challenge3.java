package challenge.test;

import org.testng.annotations.Test;

import challenge.pages.Comment;
import challenge.pages.InitialSetup;

public class Challenge3 extends InitialSetup {
	@Test
	public static void commentToIssue() {
		Comment.addComment();

	}

}
