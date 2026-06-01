/*
25. Find Longest Word
Class Name: LongestWord
Methods:
void setString(String str)
String getLongestWord()
Example
Input:
 "Java is powerful"
Output:
 "powerful"
*/
import java.util.Scanner;

class Q25_POJO
{
	private String s;
	private int i, j, k;

	public void setString(String s)
	{
		this.s = s;
	}

	public String getLongestWord()
	{
		String[] c = s.split(" ");
		k = 0;

		for(i = 0; i < c.length; i++)
		{
			if(c[i].length() > j)
			{
 				j = c[i].length();
				k = i;
			}
		}
		return c[k];
	}
}

public class Q25_LongestString
{
	public static void main(String X[])
	{
		Q25_POJO r = new Q25_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string: ");
		r.setString(sc.nextLine());

		sc.close();
		System.out.println(r.getLongestWord());
	}
}