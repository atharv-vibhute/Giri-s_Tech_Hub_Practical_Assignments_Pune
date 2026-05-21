// Q31. Write a java program to display 1 to nth Duck Number.

public class Q31_Nth_Duck_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int i = 1;
		int c = 0;
		int r = 0;
		int t = 0;

		while(c < n)
		{
			t = i;
			while(i != 0)
			{
				r = i % 10;
				i = i / 10;

				if(r == 0)
				{
					c++;
					System.out.println(t);
					break;
				}	
			}
			i = t;
			i++;
		}
	}
}