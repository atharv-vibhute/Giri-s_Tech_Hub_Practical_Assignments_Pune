// Q9. switch the 1st and last digit of the number

public class Q9_Swap_First_Last_Digit
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int t = n;
		int r = 10;
		int m = 1;
		int f, l;
		int a;

		// To count m in 1/10/100/1000...
		while(r > 9)
		{
			m = m * 10;
			r = t / m;
		}

		f = t / m; //First Digit
		t = t % m;
		l = t % 10; // Last Digit 
		t = t /10;
		a = l * m + t * 10 + f; // Swap
		System.out.println(a);		
	}
}