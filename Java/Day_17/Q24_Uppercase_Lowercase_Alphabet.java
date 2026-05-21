// Q24. Write a java program to check whether a character is uppercase or lowercase alphabet.

import java.util.Scanner;

public class Q24_Uppercase_Lowercase_Alphabet
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the alphabet: ");
		char c = sc.nextLine().charAt(0);
		sc.close();
		if(c>='a' && c<='z')	
		{
			System.out.println("Lowercase Alphabet");
		}	
		else if(c>='A' && c<='Z')
		{
			System.out.println("Uppercase Alphabet");
		}
	}
}