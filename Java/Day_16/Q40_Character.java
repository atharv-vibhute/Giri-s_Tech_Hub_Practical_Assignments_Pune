/*
Q40. Write a Java program to check whether a character is an alphabet, digit, or 
special character. 
Input : Character = @ 
Output : Special Character 
Explanation : Characters outside alphabets and digits are special characters.
*/

import java.util.Scanner;

public class Q40_Character
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character: ");
		char c = sc.nextLine().charAt(0);
		sc.close();
		if((c>='a' && c<='z') || (c>='A' && c<='Z'))
		{
			System.out.println("Alphabet");
		}
		else if(c>=0 && c<=9)
		{
			System.out.println("Digits");
		}
		else
		{
			System.out.println("Special Characters");
		}
	}
}