/*
26. Find Smallest Word
Class Name: SmallestWord
Methods:
void setString(String str)
String getSmallestWord()
Example
Input:
 "Java is easy"
Output:
 "is"
*/
import java.util.Scanner;

class Q26_POJO
{
	private String s;
	private int k = Integer.MAX_VALUE;
	private int i, j;

	public void setString(String s)
	{
		this.s = s;
	}

	public String getSmallestWord()
	{
		String[] h = s.split(" ");
		
		for(i = 0; i < h.length; i++)
		{
			if(k > h[i].length())
			{
				k = h[i].length();
				j = i;
			}
		}
		return h[j];
	}
}

public class Q26_SmallestString
{
	public static void main(String X[])
	{
		Q26_POJO a = new Q26_POJO();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		a.setString(sc.nextLine());

		sc.close();
		System.out.println(a.getSmallestWord());
	}
}