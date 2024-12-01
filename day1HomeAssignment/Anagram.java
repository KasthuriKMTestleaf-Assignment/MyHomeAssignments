package week3.day1HomeAssignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1, text2;
		text1 = "posts";
		text2 = "stopp";
		if (text1.length()==text2.length())
		{
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			boolean equals = Arrays.equals(charArray1, charArray2);
			if (equals)
			{
				System.out.println("The given strings are Anagram");
			}
			else
			{
				System.out.println("The given strings are not Anagram");
			}
		}
		else
		{
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}

	}

}
