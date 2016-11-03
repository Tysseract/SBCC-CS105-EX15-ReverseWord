package unittest.cs105;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.sbcc.cs105.ReverseWord;

public class ReverseWordTester {
	private static final int maximumScore = 6;
	private static final int maximumAssignmentScore = 8;
	private static int totalScore;

	@BeforeClass
	public static void beforeTesting() throws IOException {
		totalScore = 0;
	}

	@AfterClass
	public static void afterTesting() {
		System.out.printf("Your program's functionality scores %d out of %d.\n\n", totalScore, maximumScore);

		int difference = maximumAssignmentScore - maximumScore;
		String correctedPoint = (difference == 1) ? "point" : "points";

		System.out.printf("The assignment is worth a total of %d where the remainder of %d %s\n",
				maximumAssignmentScore, difference, correctedPoint);
		System.out.println("comes from grading related to documentation, algorithms, and other");
		System.out.println("criteria.");
	}

	@Test
	public void testBlank() throws IOException {
		assertEquals("", ReverseWord.reverseWord(""));

		totalScore += 1;
	}

	@Test
	public void testLongWords() throws IOException {
		assertEquals("suoicodilaipxecitsiligarfilacrepuS", ReverseWord.reverseWord("Supercalifragilisticexpialidocious"));		
		totalScore += 1;
		
		assertEquals("!dlroW ,olleH", ReverseWord.reverseWord("Hello, World!"));		
		totalScore += 1;
	}

	@Test
	public void testReversedWords() throws IOException {
		assertEquals("a", ReverseWord.reverseWord("a"));
		totalScore += 1;

		assertEquals("abba", ReverseWord.reverseWord("abba"));
		totalScore += 1;
		
		assertEquals("ab ba", ReverseWord.reverseWord("ab ba"));
		totalScore += 1;		
	}
}
