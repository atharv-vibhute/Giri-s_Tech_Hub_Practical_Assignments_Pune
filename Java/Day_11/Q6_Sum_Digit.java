// 6. Write a program and compute the sum of an 3 digit integer's digits. 

public class Q6_Sum_Digit 
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int r = 0;
		int s = 0;

		while(n != 0)
		{
			r = n % 10;
			s = s + r;
			n = n / 10;
		}

		System.out.println("Sum: " + s);
	}
}