/*
23. Extract Initial Letters
Class Name: InitialExtractor
Methods:
void setString(String str)
String getInitials()
Example
Input:
 "Central Processing Unit"
Output:
 "CPU"
*/
import java.util.Scanner;

class Q23_POJO
{
	private String s;
	private String o = "";
	private int i;

	public void setString(String s)
	{
		this.s = s;
	}

	public String Initialextractor()
	{
		o += s.charAt(0);

		for(i = 0; i < s.length()- 1; i++)
		{
			if(s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') o += s.charAt(i + 1);
		}

		return o;
	}
}

public class Q23_Initial_Letters
{
	public static void main(String X[])
	{
		Q23_POJO t = new Q23_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String: ");
		t.setString(sc.nextLine());
		
		sc.close();
		System.out.println(t.Initialextractor());
	}
}