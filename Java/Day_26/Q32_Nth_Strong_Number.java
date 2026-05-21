// Q32. Write a java program to display 1 to nth Strong Number.

public class Q32_Nth_Strong_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int i, f, a, r, s;
		int j = 1;
 		int c = 0;

		while(c < n)
		{
			r = 0;
			s = 0;
			a = j;

			while(j != 0)
			{
				r = j % 10;
				f = 1;
				i = 1;
		
				if(r == 0)
				{
					f = 1;
					s = s + f;
				}
				else
				{
					i = 1;
					f = 1;

					while(i <= r)
					{
						f = f * i;
						i++;
					}
					s = s + f;
				}

				j = j / 10;
			}

			if(s == a)
			{
				System.out.println(a);
				c++;
			}

			j = a;
			j++;
		}
	}
}