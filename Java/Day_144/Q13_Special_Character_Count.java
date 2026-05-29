/*
13. Count Special Characters
Class Name: SpecialCharacterCount
Methods:
void setString(String str)
int getSpecialCharacterCount()
Description
Counts symbols like @,#,$,%,&.
Example
Input: "Java@123#"
Output: 2
*/
import java.util.Scanner;

class Q13_POJO
{
	private String s;
	private int i;
	private int c = 0;

	public void setString(String s)
	{
		this.s = s;
	}

	public int getSpecialCharacterCount()
	{
		for(i = 0; i < s.length(); i++)
		{
			if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) < 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9'))
				c++;
		}

		return s.length() - c;
	}
}

public class Q13_Special_Character_Count
{
	public static void main(String X[])
	{
		Q13_POJO a = new Q13_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string: ");
		a.setString(sc.next());

		sc.close();
		System.out.println(a.getSpecialCharacterCount());
	}
}