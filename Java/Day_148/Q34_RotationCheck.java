/*
34. Check Rotational String
Class Name: RotationCheck
Methods:
void setStrings(String s1, String s2)
boolean isRotation()
Example
Input:
 "ABCD", "CDAB"
Output:
 true
*/
import java.util.Scanner;

class Q34_POJO
{
	private String a;
	private String b;
	private char t;
	private int i;
	private int r = 0;
	private Boolean f;

	public void setStrings(String a, String b)
	{
		this.a = a;
		this.b = b;
	}

	public boolean isRotation()
	{
		char[] j = a.toCharArray();
		char[] k = b.toCharArray();

		if(j.length == k.length)
		{
			while(r < k.length)
			{
				f = true;
				
				for(i = 0; i < k.length; i++) 
				{
					if(j[i] != k[i]) 
					{	
						f = false;
						break;
					}
				}

				if(f) return true;
				else
				{
					t = k[0];
					for(i = 0; i < k.length - 1; i++) k[i] = k[i + 1];
					k[k.length - 1] = t;
				}

				r++;
			}
	
			return false;
		}
		else return false;

	}
}

public class Q34_RotationCheck
{
	public static void main(String X[])
	{
		Q34_POJO m = new Q34_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first String: ");
		String x = sc.nextLine();

		System.out.println("Enter the second String: ");
		String y = sc.nextLine();

		sc.close();
		m.setStrings(x, y);
		System.out.println(m.isRotation());
	}
}