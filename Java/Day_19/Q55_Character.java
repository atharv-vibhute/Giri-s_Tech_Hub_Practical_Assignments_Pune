/*
Q55. Write a program to input a character and check whether it is a vowel or consonant using a switch case.
Explanation: Switch on the lowercase character. Use cases for 'a', 'e', 'i', 'o', 'u'; default for consonant.
*/

import java.util.Scanner;

public class Q55_Character
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lowercase character: ");
		char c = sc.nextLine().charAt(0);
		sc.close();
		
		switch(c)
		{
			case 'a':
				System.out.println("Vowel");
				break;

			case 'e':
				System.out.println("Vowel");
				break;

			case 'i':
				System.out.println("Vowel");
				break;

			case 'o':
				System.out.println("Vowel");
				break;

			case 'u':
				System.out.println("Vowel");
				break;

			default:
				System.out.println("Consonant");
		}
	}
}