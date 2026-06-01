/*
32. Generate All Substrings
Class Name: SubstringGenerator
Methods:
void setString(String str)
void generateSubstring()
Description
Generate every possible substring.
Example
Input:
 "abc"
Output:
 a, b, c, ab, bc, abc
*/
import java.util.Scanner;

class Q32_POJO
{
	private String s;
	private int t, e, i;

	public void setString(String s)
	{
		this.s = s;
	}

	public void generateSubstring()
	{
		for(t = 0; t < s.length(); t++)
		{
			for(e = t; e < s.length(); e++)
			{
				System.out.print(s.substring(t, e + 1) + " ");
			}
		}
	}
}

public class Q32_SubString
{
	public static void main(String[] X)
	{
		Q32_POJO x = new Q32_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String: ");
		x.setString(sc.nextLine());

		sc.close();
		x.generateSubstring();	
	}
}

