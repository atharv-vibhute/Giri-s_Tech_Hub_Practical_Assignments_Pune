/*
18. Check Anagram String
Class Name: AnagramCheck
Methods:
void setStrings(String s1, String s2)
boolean isAnagram()
Description
Checks whether both strings contain same characters.
Example
Input:
 "listen", "silent"
Output:
 true
*/
import java.util.Scanner;

class Q18_POJO
{
	private String s1, s2, p , q;
	private char[] x = new char[26];
	private char[] y = new char[26];
	private int i;

	public void setStrings(String s1, String s2)
	{
		this.s1 = s1;
		this.s2 = s2;
		p = s1.toLowerCase();
		q = s2.toLowerCase();
	}

	public boolean isAnagram()
	{
		if(s1.length() == s2.length())
		{
			for(i = 0; i < p.length(); i++)
			{
				x[p.charAt(i) - 'a']++;
			}

			for(i = 0; i < q.length(); i++)
			{
				y[q.charAt(i) - 'a']++;
			}

			for(i = 0; i < 26; i++)
			{
				if(x[i] != y[i]) return false;
			}

			return true;
		}
		else return false;
	}	
}

public class Q18_AnagramCheck
{
	public static void main(String X[])
	{
		Q18_POJO i = new Q18_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first string: ");
		String s1 = sc.nextLine();
		System.out.println("Enter second string: ");
		String s2 = sc.nextLine();
		sc.close();

		i.setStrings(s1, s2);
		System.out.println(i.isAnagram());
	}
}