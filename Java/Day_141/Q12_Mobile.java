/*
Question 12: Write a Java program to implement a Mobile Recharge Plan Selector.
Create a class Recharge with attributes mobileNumber and planAmount.
Determine plan benefits:
- Plan 199 => 1GB/day
- Plan 399 => 2GB/day
- Plan 599 => 3GB/day
- Other => Invalid Plan
Input:
Enter Mobile Number : 9876543210
Enter Plan Amount : 399

Output:
Mobile Number : 9876543210
Plan : 399
Benefit : 2GB per day

Explanation:
A class Recharge is created with mobileNumber and planAmount.
User enters the mobile number and selects a recharge plan.
A switch-case or if-else block is used to match the plan:
- planAmount == 199 => 1GB per day
- planAmount == 399 => 2GB per day
- planAmount == 599 => 3GB per day
- default => Invalid Plan
Since planAmount = 399, the benefit is 2GB per day.
This program models a real telecom recharge system using class and conditional logic.

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

class Q12_Recharge
{
	int p;
	long n;
	Scanner sc = new Scanner(System.in);

	void get()
	{
		System.out.println("Enter Mobile Number : ");
		n = sc.nextLong();
		System.out.println("Enter Plan Amount : ");
		p = sc.nextInt();
		sc.close();
	}

	void display()
	{
		System.out.println("Mobile Number : " + n);
		System.out.println("Plan : " + p);
		System.out.print("Benefit : ");

		switch(p)
		{
			case 199:
				System.out.println("1 GB per day");
				break;

			case 399: 
				System.out.println("2 GB per day");
				break;

			case 599:
				System.out.println("3 GB per day");
				break;

			default:
				System.out.println("Invaild Plan");
		}
	}
}

public class Q12_Mobile
{
	public static void main(String X[])
	{
		Q12_Recharge a = new Q12_Recharge();
		a.get();
		a.display();
	}
}