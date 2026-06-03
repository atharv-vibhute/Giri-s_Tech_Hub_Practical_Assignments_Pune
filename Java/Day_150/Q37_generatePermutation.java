/*
37. String Permutations
Class Name: PermutationString
Methods:
void setString(String str)
void generatePermutation()
Example
Input:
 "ABC"
Output:
 ABC, ACB, BAC, BCA, CAB, CBA
*/
import java.util.Scanner;

class Q37_POJO
{
	private String s;
	private String t;
	private int i, j, k;

	public void setString(String s)
	{
		this.s = s;
	}

	public void generatePermutation()
	{
		for(i = 0; i < s.length(); i++)
		{
			for(j = 0; j < s.length(); j++)
			{
				for(k = 0; k < s.length(); k++)
				{
					if(i != j && i != k && j != k)
					{
						t = "" + s.charAt(i) + s.charAt(j) + s.charAt(k);
						System.out.print(t + " ");
					}
				}
			}
		}
	}
}

public class Q37_generatePermutation
{
	public static void main(String X[])
	{
		Q37_POJO c = new Q37_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String: ");
		c.setString(sc.nextLine());

		sc.close();
		c.generatePermutation();
	}
}