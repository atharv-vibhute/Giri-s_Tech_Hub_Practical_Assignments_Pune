/*
Question 17: Write a Java program to implement an Area Calculator using Method Overloading.
Create a class AreaCalculator and overload method area():
- area(int side) => Calculate area of square
- area(int length, int breadth) => Calculate area of rectangle
- area(int base, int height, int type) => Calculate area of triangle
Input:
Enter side : 5
Enter length and breadth : 10 4
Enter base and height : 8 6

Output:
Area of Square : 25
Area of Rectangle : 40
Area of Triangle : 24

Explanation:
Method overloading is used to compute different areas using one method name area().
area(5):
- Square area = side * side = 5 * 5 = 25
area(10, 4):
- Rectangle area = length * breadth = 10 * 4 = 40
area(8, 6, type):
- Triangle area = (base * height) / 2 = (8 * 6) / 2 = 24
- The third parameter 'type' distinguishes it from the rectangle overload.
Java selects the correct version based on number/type of arguments.
This demonstrates practical usage of method overloading for geometric calculations.

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

public class Q17_Overloading_Area
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c;

		System.out.println("Enter the side of square: ");
		a = sc.nextInt();
		area(a);

		System.out.println("Enter the length of rectangle: ");
		a = sc.nextInt();
		
		System.out.println("Enter the breath of rectangle: ");
		b = sc.nextInt();
		area(a, b);

		System.out.println("Enter the base of triangle: ");
		a = sc.nextInt();

		System.out.println("Enter the height of triangle: ");
		b = sc.nextInt();

		System.out.println("Enter the type: ");
		c = sc.nextInt();
		
		area(a, b, c);
		sc.close();
	}

	public static void area(int a)
	{
		System.out.println("Area of Square : " + (a * a));
	}

	public static void area(int a, int b)
	{
		System.out.println("Area of Retangle : " + (a * b));
	}

	public static void area(int a, int b, int c)
	{
		System.out.println("Area of Triangle : " + ((a * b) / 2));
	}
}