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
		System.out.println("Enter the Character: ");
		char ch = sc.nextLine().charAt(0);
		sc.close();
		if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
		{
			System.out.println("Alphabet");
		}
		else
		{
			System.out.println("Not Alphabet");
		}
	}
}