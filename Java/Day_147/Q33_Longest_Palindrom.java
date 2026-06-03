/*
33. Longest Palindrome Substring
Class Name: LongestPalindrome
Methods:
void setString(String str)
String getLongestPalindrome()
Example
Input:
 "babad"
Output:
 "bab"
*/
import java.util.Scanner;

class Q33_POJO
{
	private String s;
	private String o;
	private String l = "";
	private int t, e, a, b, c;
	private boolean f;

	public void setString(String s)
	{
		this.s = s;
	}

	public String getLongestPalindrome()
	{
		c = 0;

		for(t = 0; t < s.length(); t++)
		{
			o = "";
			for(e = t; e < s.length(); e++)
			{
				o = s.substring(t, e + 1);
				f = true;

				a = 0;
				b = o.length() - 1;

				while(a <= b)
				{
					if(s.charAt(a) != s.charAt(b))
					{
						f = false;
						break;
					}
					a++;
					b--;
				}

				if(f)
				{
					if(o.length() > c)
					{
						c = o.length();
						l = o;
						
					}	
				}
			}
		}

		return l;
	}
}

public class Q33_Longest_Palindrom
{
	public static void main(String X[])
	{
		Q33_POJO m = new Q33_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String: ");
		m.setString(sc.nextLine());

		sc.close();
		System.out.println(m.getLongestPalindrome());
	}
}

