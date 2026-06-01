/*
28. Remove Particular Character
Class Name: RemoveCharacter
Methods:
void setData(String str, char ch)
String removeCharacter()
Example
Input:
 "banana", 'a'
Output:
 "bnn"
*/
import java.util.Scanner;

class Q28_POJO
{
	private String s;
	private char c;
	private String r = "";
	private int i;

	public void setData(String s, char c)
	{
		this.s = s;
		this.c = c;
	}

	public String removeCharacter()
	{
		for(i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) != c)
				r += s.charAt(i);
		}
		return r;
	}
}

public class Q28_RemovedCharacter
{
	public static void main(String X[])
	{
		Q28_POJO b = new Q28_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String: ");
		String y = sc.nextLine();

		System.out.println("Enter the character: ");
		String z = sc.nextLine();
		char a = z.charAt(0);

		sc.close();
		b.setData(y, a);
		System.out.println(b.removeCharacter());
	}
}