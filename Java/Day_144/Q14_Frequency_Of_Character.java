/*
14. Find Frequency of Character
Class Name: CharacterFrequency
Methods:
void setData(String str, char ch)
int getFrequency()
Description
Count how many times a character appears.
Example
Input:
 "banana", 'a'
Output:
 3
*/
import java.util.Scanner;

class Q14_POJO
{
	private String s;
	private char c;
	private int f = 0;
	private int i;

	public void setData(String s, char c)
	{
		this.s = s;
		this.c = c;
	}

	public int getFrequency()
	{
		for(i = 0; i < s.length(); i++) if(s.charAt(i) == c) f++;
		return f;
	}
}

public class Q14_Frequency_Of_Character
{
	public static void main(String X[])
	{
		Q14_POJO b = new Q14_POJO();
		Scanner sc = new Scanner(System.in);
		String s;
		String q;
		char c;

		System.out.println("Enter the String: ");
		s = sc.nextLine();
		System.out.println("Enter the Character: ");
		q = sc.nextLine();
		c = q.charAt(0);
		sc.close();

		b.setData(s, c);
		System.out.println(b.getFrequency());
	}
}