/*
27. Check String Contains Number
Class Name: ContainsNumber
Methods:
void setString(String str)
boolean hasNumber()
Example
Input:
 "Java123"
Output:
 true
*/
import java.util.Scanner;

class Q27_POJO
{
	private String s;
	private int i;

	public void setString(String s)
	{
		this.s = s;
	}

	public boolean hasNumber()
	{
		for(i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
				return true;
		}
		return false;
	}
}

public class Q27_ContinasNumber
{
	public static void main(String X[])
	{
		Q27_POJO q = new Q27_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String: ");
		q.setString(sc.nextLine());
	
		sc.close();
		System.out.println(q.hasNumber());
	}
}