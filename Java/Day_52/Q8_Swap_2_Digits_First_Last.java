// Q8. Write a program to swap fisrt two digit with last two digit of a integer number

public class Q8_Swap_2_Digits_First_Last
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int t = n;
		int r = t % 100;
		int c = 0;
		int m = 1;
		int i;
		int a;

		while(t != 0)
		{
			t = t / 10;
			c++;
		}

		for(i = 2; i < c; i++)
		{
			m = m * 10;
		}

		t = n;
		a = t / m;

		t = t - a * m - r;
		t = t + r * m + a;
		System.out.println(t);
	}
}
