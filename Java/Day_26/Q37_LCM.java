// Q37. Write a java program to find LCM of two numbers.

public class Q37_LCM
{
	public static void main(String X[])
	{
		int n1 = Integer.parseInt(X[0]);
		int n2 = Integer.parseInt(X[1]);
		int i;
		
		if(n1 > n2)
		{
			i = n1;
			while(i <= (n1*n2))
			{
				if((i%n1==0) && (i%n2==0))
				{
					break;
				}
				else
				{
					i++;
				}
			}
			System.out.println(i);
		}
		else if(n1 < n2)
		{
			i = n2;
			while(i <= (n1*n2))
			{
				if((i%n1==0) && (i%n2==0))
				{
					break;
				}
				else
				{
					i++;
				}
			}
			System.out.println(i);
		}
		else
		{
			System.out.println(n2);
		}
	}
}