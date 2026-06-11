/*
Question 9: Write a Java program to calculate average of three subject marks using constructor.

Description: Create Result class with three subject marks. Initialize using constructor. Calculate average and display result.
INPUT:
Enter Marks: 70 80 90

OUTPUT:
Average Marks: 80

EXPLANATION:
Create Result class with fields mark1, mark2, mark3. Use constructor public Result(int m1, int m2, int m3) to initialize. Calculate average as (m1 + m2 + m3) / 3. Create method displayAverage() to print average. Create object new Result(70, 80, 90) and display average.

Asked In Companies:
Practice Assignment
*/

import java.util.Scanner;

class Q9_Marks
{
	int a;

	Q9_Marks(int x, int y, int z)
	{
		a = (x + y + z) / 3;
	}

	public void display()
	{
		System.out.println("Average Marks: " + a);
	}
}

public class Q9_Average
{
	public static void main(String X[])
	{
		int a, b, c;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Marks: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sc.close();

		Q9_Marks r = new Q9_Marks(a, b, c);
		r.display();
	}
}