
//Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>".

//makeOutWord("<<>>", "Yay") ? "<<Yay>>"
//makeOutWord("<<>>", "WooHoo") ? "<<WooHoo>>"
//makeOutWord("[[]]", "word") ? "[[word]]"

//used substring with single value and multiple value also.
package _1_BASICS.string.questions;

public class StringEx03 {
	public String makeOutWord(String out, String word) {
		// <<>>, Jack ==> <<Jack>>
		return out.substring(0, 2) + word + out.substring(2);
		// out.substring(0, 2) = index 0, and index 1 [2-1];
		// out.substring(2) = out[2] and out[3] for remaining Characters
	}

	public static void main(String[] args) {
		StringEx03 aobj = new StringEx03();
		String result = aobj.makeOutWord("<<>>", "Jack");
		System.out.println(result);
	}
}