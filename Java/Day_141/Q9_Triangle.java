/*
Question 9: Write a Java program to implement a Triangle Type Identifier.
Create a class Triangle with attributes side1, side2, side3.
Identify triangle type:
- All sides equal => Equilateral
- Two sides equal => Isosceles
- All sides different => Scalene
Input:
Enter Side1 : 5
Enter Side2 : 5
Enter Side3 : 5

Output:
Triangle Type : Equilateral Triangle

Explanation:
A class Triangle is created with three instance variables: side1, side2, side3.
User enters all three side values.
Conditions used:
- if (side1 == side2 && side2 == side3) => Equilateral Triangle
- else if (side1 == side2 || side2 == side3 || side1 == side3) => Isosceles Triangle
- else => Scalene Triangle
Since all three sides are 5, the condition side1 == side2 == side3 is true.
Output: Equilateral Triangle
This program demonstrates logical AND and OR operators with class objects.

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

class Q9_Types
{
	int a, b, c;
	Scanner sc = new Scanner(System.in);

	void get()
	{
		System.out.println("Enter side1 :");
		a = sc.nextInt();
		System.out.println("Enter side2 :");
		b = sc.nextInt();
		System.out.println("Enter side3 :");
		c = sc.nextInt();
		sc.close();
	}

	void display()
	{
		if(a + b > c && b + c > a && c + a > b)
		{
			if(a == b && b == c) System.out.println("Equilateral Triangle");
			else if(a != b && b != c && c != a) System.out.println("Scalene Triangle");
			else System.out.println("Isosceles Triangle");
		}
		else System.out.println("Invaild Trangle");
	}
}

public class Q9_Triangle
{
	public static void main(String X[])
	{
		Q9_Types d = new Q9_Types();
		d.get();
		d.display();
	}
}
