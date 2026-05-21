/*
Q35. Check if a person is a child, teenager, adult, or senior based on age.
    Input: Age
    Logic: if-else if
    Output: Age category.
*/

public class Q35_Age
{
	public static void main(String X[])
	{
		int a = Integer.parseInt(X[0]);
		if(a>=0 && a<=12)
		{
			System.out.println("Child");
		}
		else if(a>12 && a<20)
		{
			System.out.println("Teenager");
		}
		else if(a>=20 && a<=60)
		{
			System.out.println("Adult");
		}
		else if(a>60)
		{
			System.out.println("Senior");
		}
	}
}