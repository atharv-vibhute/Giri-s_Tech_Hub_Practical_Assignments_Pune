/*
Q23. Write a java program to Check Number Is Duck Number or Not.
Example : A Duck number is a positive number which has zeroes present in it, For example 3210, 8050896, 70709 are all Duck numbers.
*/

public class Q23_Duck_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int r;
		Boolean f = false;

		do
		{
			r = n % 10;
			n = n / 10;
			
			if(r == 0)
			{
				f = true;
				break;
			}
		} while(n != 0);

		System.out.println((f == true)? "Duck Number" : "Not Duck Number");
	}
}