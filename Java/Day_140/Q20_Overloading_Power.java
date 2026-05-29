/*
Question 20: Write a Java program to implement a Power Calculator using Method Overloading.
Create a class Power and overload method calculate():
- calculate(int n) => Find square of n
- calculate(int n, int p) => Find n raised to power p
Input:
Enter number : 6
Enter number and power : 2 5

Output:
Square : 36
Power Result : 32

Explanation:
calculate(6):
- Square = n * n = 6 * 6 = 36.
calculate(2, 5):
- Power = 2 raised to 5 = 2 * 2 * 2 * 2 * 2 = 32.
- Implemented using Math.pow(n, p) or a loop.
Method overloading distinguishes the two methods by argument count.
Result 36 is a square. Result 32 = 2^5.
This program demonstrates exponentiation using overloaded methods.

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

public class Q20_Overloading_Power
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int x, y, z;

		System.out.println("Enter number : ");
		x = sc.nextInt();

		System.out.println("Enter number and power: ");
		y = sc.nextInt();
		z = sc.nextInt();
		sc.close();

		power(x);
		power(y, z);
	}

	public static void power(int x)
	{
		System.out.println("Square : " + (x * x));
	}

	public static void power(int y, int z)
	{
		int i = 0;
		int n = 1;

		while(i < z)
		{
			n *= y;
			i++;
		}

		System.out.println("Power Result : " + n);
	}
}