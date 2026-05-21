// Q3. Write a java program to display 1 to nth Strong Number. 

public class Q3_Nth_Strong_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int r, j, f, s, t;
		int i = 1;
		int a = 0;

	        while(a < n)
		{
			s = 0;
			t = i;

			while(t != 0)
			{
				r = t % 10;
				t = t / 10;
				f = 1;

				for(j = 1; j <= r; j++)
				{
					f = f * j;
				}

				s = s + f;
			}

			if(i == s)
			{
				System.out.print(i + " ");
				a++;
			}
			i++;
		}
	}
}



