/*
Question 16: Write a Java program to implement Number Operation using Method Overloading.
Create a class NumberOperation and overload method calculate():
- calculate(int a, int b) => Find addition of two numbers
- calculate(int a, int b, int c) => Find the largest among three numbers
Input:
Enter two numbers : 10 20
Enter three numbers : 12 45 30

Output:
Addition : 30
Largest Number : 45

Explanation:
Method overloading allows the same method name to perform different tasks based on parameters.
calculate(int a, int b):
- Adds two numbers: 10 + 20 = 30. Prints Addition : 30.
calculate(int a, int b, int c):
- Finds largest using if-else: 12, 45, 30 => 45 is the largest.
Java automatically selects the correct method based on number of arguments.
This is compile-time polymorphism (method overloading).
Method overloading improves code readability by using one name for related operations.

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

public class Q16_Overloading_Sum
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Enter the first value: ");
		a = sc.nextInt();

		System.out.println("Enter the second value: ");
		b = sc.nextInt();
		calculate(a, b);

		System.out.println("Enter the first value: ");
		a = sc.nextInt();

		System.out.println("Enter the second value: ");
		b = sc.nextInt();

		System.out.println("Enter the third value: ");
		c = sc.nextInt();

		sc.close();
		calculate(a, b, c);
	}

	public static void calculate(int a, int b)
	{
		System.out.println("Addition: " + (a + b));
	}

	public static void calculate(int a, int b, int c)
	{
		if(a > b && a > c) System.out.println("Largest Number: " + a);
		else if(b > a && b > c) System.out.println("Largest Number: " + b);
		else System.out.println("Largest Number: " + c);
	}
}