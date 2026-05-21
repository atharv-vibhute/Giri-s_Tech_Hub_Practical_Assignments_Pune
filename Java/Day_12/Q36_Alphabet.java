/*
Q36. Write a Java program to check whether a character is an alphabet or not.
 Input : Character = A
 Output : Alphabet
 Explanation : Alphabet characters fall between A–Z or a–z.
*/

import java.util.Scanner;

public class Q36_Alphabet 
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character:");
		char c = sc.next().charAt(0);
		sc.close();
		String s = ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))? "Alphabet" : "Not Alphabet";
		System.out.println(s);
	}
}