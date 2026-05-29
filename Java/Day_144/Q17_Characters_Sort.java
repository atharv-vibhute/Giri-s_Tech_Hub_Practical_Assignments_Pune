/*
17. Sort Characters in String
Class Name: SortString
Methods:
void setString(String str)
String sortCharacters()
Description
Arrange characters alphabetically.
Example
Input:
 "dcba"
Output:
 "abcd"
*/
import java.util.Scanner;

class Q17_POJO
{
	private String s;
	private String n = "";
	private int i, j;
	private char t;

	public void setString(String s)
	{
		this.s = s;
	}

	public String sortCharacters()
	{
		char[] b = s.toCharArray();
	
		for(i = 0; i < b.length - 1; i++)
		{
			for(j = i + 1; j < b.length; j++)
			{
				if(b[i] > b[j])
				{
					t = b[i];
					b[i] = b[j];
					b[j] = t;
				}
			}
		}

		for(i = 0; i < b.length; i++) n += b[i];
		return n;
	}
}

public class Q17_Characters_Sort
{
	public static void main(String X[])
	{
		Q17_POJO p = new Q17_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string: ");
		p.setString(sc.nextLine());

		sc.close();
		System.out.println(p.sortCharacters());
	}
}