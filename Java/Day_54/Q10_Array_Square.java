/*
Q10. WAP to calculate the square of every in a array & display it.
int a[] = new int[]{2, 3, 4, 5, 6};
*/

public class Q10_Array_Square
{
	public static void main(String X[])
	{
		int a[] = new int[5];
		a[] = {2, 3, 4, 5, 6};
		for(int i = 0; i < a.lenght(); i++)
		{
			System.out.print(a[i] * a[i] + " ");
		}
	}
}