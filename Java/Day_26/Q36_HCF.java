// Q36. Write a java program to find HCF (GCD) of two numbers.

public class Q36_HCF
{
	public static void main(String X[])
	{
		int n1 = Integer.parseInt(X[0]);
		int n2 = Integer.parseInt(X[1]);
		int i;
		
		if(n1 < n2)
		{
			i = n1;
			while(i != 0)
			{
				if((n1%i==0) && (n2%i==0))
				{
					break;
				}
				else
				{
					i--;
				}
			}
			System.out.println(i);
		}
		else if(n2 < n1)
		{
			i = n2;
			while(i != 0)
			{
				if((n1%i==0) && (n2%i==0))
				{
					break;
				}
				else
				{
					i--;
				}
			}
			System.out.println(i);
		}
		else
		{
			System.out.println(n1);
		}
	}
}