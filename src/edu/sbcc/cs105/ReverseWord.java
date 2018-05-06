/**
 * CS 105 Theory & Practice I
 * CRN: 62499
 * Assignment: ReverseWord
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Mattys C vanZeyl
 */

package edu.sbcc.cs105;

public class ReverseWord {
	public static String reverseWord(String word) {
		String drow = "";
		
		for(int i = word.length(); i > 0; i-=1) {
			drow = drow + word.charAt(i-1);
		}
		return drow;
	}
}
