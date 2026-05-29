/*
Question 32: Write a Java program to implement a Triangle Validator using POJO class.
Create a POJO class Triangle with variables side1, side2, and side3.
Determine the triangle type:
- All sides equal => Equilateral
- Two sides equal => Isosceles
- All sides different => Scalene
Input:
Enter Side1 : 5
Enter Side2 : 5
Enter Side3 : 8

Output:
Triangle Type : Isosceles

Explanation:
A POJO class Triangle has private fields: side1, side2, side3.
Setters accept user input. Getters are used in the type-checking logic.
Conditions:
- if (side1 == side2 && side2 == side3) => Equilateral
- else if (side1 == side2 || side2 == side3 || side1 == side3) => Isosceles
- else => Scalene
Since side1 = 5 and side2 = 5 (two sides equal), the type is Isosceles.
side3 = 8 is different from side1 and side2.
This shows conditional logic applied to POJO class data.

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

class Q32_POJO
{
	private int s1, s2, s3;
	
	public void setS1(int s1)
	{
		this.s1 = s1;
	}

	public int getS1()
	{
		return s1;
	}

	public void setS2(int s2)
	{
		this.s2 = s2;
	}

	public int getS2()
	{
		return s2;
	}

	public void setS3(int s3)
	{
		this.s3 = s3;
	}

	public int getS3()
	{
		return s3;
	}
}

public class Q32_Triangle
{
	public static void main(String X[])
	{
		Q32_POJO t = new Q32_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter side1 : ");
		t.setS1(sc.nextInt());

		System.out.println("Enter side2 : ");
		t.setS2(sc.nextInt());

		System.out.println("Enter side3 : ");
		t.setS3(sc.nextInt());
		sc.close();

		int s1 = t.getS1();
		int s2 = t.getS2();
		int s3 = t.getS3();
		System.out.print("Triangle Type : ");

		if((s1 < s2 + s3) && (s2 < s3 + s1) && (s3 < s1 + s2))
		{
			if(s1 == s2 && s2 == s3) System.out.println("Equilateral Triangle");
			else if(s1 != s2 && s2 != s3 && s3 != s1) System.out.println("Scalene Triangle");
			else System.out.println("Isosceles Triangle");
		}
		else System.out.println("Invaild Triangle");
	}
}