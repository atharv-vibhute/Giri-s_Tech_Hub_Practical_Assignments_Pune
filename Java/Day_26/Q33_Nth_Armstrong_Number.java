// Q33. Write a java program to display 1 to nth Armstrong Number.

public class Q33_Nth_Armstrong_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
          	int r, j, p, s, t, i;
		int c = 0;
		int a = 1;

		while(c < n)
		{
			t = a;
			i = 0;
			while(a != 0)
			{
				a = a / 10;
				i++;
			}
	
			a = t;
			r = 0;
			s = 0;

			while(a != 0)
			{
				r = a % 10;
				a = a / 10;
				p = 1;
				j = 0;

				while(j < i)
				{
					p = p * r;
					j++;
				}
			
				s = s + p;
			}

			if(s == t)
			{
				System.out.println(t);
				c++;
			}
	
			a = t;
			a++;
		}
	}
}