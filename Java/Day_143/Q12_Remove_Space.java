/*
12. Remove Spaces from String
Class Name: RemoveSpaces
Methods:
void setString(String str)
String removeSpace()
Description
Remove all spaces from string.
Example
Input: "Java Programming"
Output: "JavaProgramming"
*/
import java.util.Scanner;

class Q12_POJO
{
	private String s;
	private String l = "";
	private int i;

	public void setString(String s)
	{
		this.s = s;
	}

	public String removeSpace()
	{
		for(i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) != ' ') 
			{
				l += s.charAt(i);
			}
		}
		return l;
	}
}

public class Q12_Remove_Space
{
	public static void main(String X[])
	{
		Q12_POJO c = new Q12_POJO();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		c.setString(sc.nextLine());
		
		sc.close();
		System.out.println(c.removeSpace());
	}
}