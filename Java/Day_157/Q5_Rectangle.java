/*
Question 5: Write a Java program to create a Rectangle class and calculate area using constructor.

Description: Create Rectangle class with length and width. Initialize values using constructor and calculate area using formula length × width.
INPUT:
Enter Length: 10
Enter Width: 5

OUTPUT:
Area of Rectangle is: 50

EXPLANATION:
Create Rectangle class with fields length and width. Use constructor public Rectangle(int length, int width) to initialize values. Calculate area as length * width. Create method to display area. Create object new Rectangle(10, 5) and display area.

Asked In Companies:
Practice Assignment
*/

import java.util.Scanner;

class Q5_Area
{
	int a;
	
	Q5_Area(int length, int width)
	{
		a = length * width;
	}

	public void display()
	{
		System.out.println("Area of Rectangle is: " + a);
	}
}

public class Q5_Rectangle
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int l, w;

		System.out.println("Enter length: ");
		l = sc.nextInt();

		System.out.println("Enter width: ");
		w = sc.nextInt();

		sc.close();
		Q5_Area a = new Q5_Area(l, w);
		a.display();
	}
}