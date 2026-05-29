/*
3. Reverse String
Problem Statement
Create class ReverseString with methods:
void setString(String str)
String getReverse()
Method Description
void setString(String str)
Stores string into variable.
String getReverse()
Returns reverse of string.
Example
Input: "Java"
Output: "avaJ"
Explanation
Characters are printed from last to first.
*/
import java.util.Scanner;

class Q3_POJO
{
	private String s;
	private String r = "";
	private int i;

	public void setString(String s)
	{
		this.s = s;
	}

	public String getReverse()
	{
		for(i = s.length() - 1; i >= 0; i--)
		{
			r = r + s.charAt(i);
		}
		return r;
	}
}

public class Q3_Reverse
{
	public static void main(String X[])
	{
		Q3_POJO c = new Q3_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string: ");
		c.setString(sc.next());

		sc.close();
		System.out.println(c.getReverse());
	}
}