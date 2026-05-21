/*
Q39. Write a Java program to input an alphabet and check whether it is a vowel or consonant.
 Input : Alphabet = e
 Output : Vowel
 Explanation : Vowels include a, e, i, o, u.
*/

import java.util.Scanner;

public class Q39_Vowel_Consonant
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Alphabet: ");
		char c = sc.next().charAt(0);
		String s = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')? "Vowel" : "Consonant";
		System.out.println(s);
	}
}