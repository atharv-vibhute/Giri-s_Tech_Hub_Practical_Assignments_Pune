/*
24. Reverse Each Word
Class Name: ReverseEachWord
Methods:
void setString(String str)
String reverseWords()
Example
Input:
 "Java Language"
Output:
 "avaJ egaugnaL"
*/
import java.util.Scanner;

class Q24_POJO
{
	private String s;
	private String k = "";
	private String l = "";
	private int i, j;
	private char t;

	public void setString(String s)
	{
		this.s = s;
	}

	public String reverseWords()
	{
		// Split String into String array.
		String[] b = s.split(" ");
		String[] c = new String[b.length];
		
		// Reverse Logic
		for(i = 0; i < b.length; i++)
		{
			l = "";
			// Split string into  char array.
			char[] d = b[i].toCharArray();

			// Reverse by 2 pointer approch
			for(j = 0; j < d.length / 2; j++)
			{
				t = d[j];
				d[j] = d[d.length - 1 - j];
				d[d.length - 1 - j] = t;
			}

			// Contonct chacter into string.
			for(j = 0; j < d.length; j++)
			{
				l += d[j];
			}

			c[i] = l;
		}

		for(i = 0; i < c.length; i++)
		{
			k = k + c[i] + " ";
		}

		return k;
	}
}

public class Q24_Reverse
{
	public static void main(String X[])
	{
		Q24_POJO r = new Q24_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String: ");
		r.setString(sc.nextLine());

		sc.close();
		System.out.println(r.reverseWords());
	}
}