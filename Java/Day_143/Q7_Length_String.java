/*
7. Find Length of String
Problem Statement
Create class StringLength with methods:
void setString(String str)
int getLength()
Method Description
void setString(String str)
Stores string.
int getLength()
Returns total number of characters in string.
Example
Input: "Programming"
Output: 11
*/
import java.util.Scanner;

class Q7_POJO
{
	private String s;
	private int i;
	private int c = 0;

	public void setString(String s)
	{
		this.s = s;
	}

	public int getLength()
	{
		for(i = 0; i < s.length(); i++) c++;
		return c;
	}
}

public class Q7_Length_String
{
	public static void main(String X[])
	{
		Q7_POJO z = new Q7_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String: ");
		z.setString(sc.next());
		
		sc.close();
		System.out.println(z.getLength());
	}
}