/*
Question 7: Write a Java program to implement an Electricity Bill Calculator.
Create a class ElectricityBill with attributes customerId, name, and units.
Calculate bill using slabs:
- First 100 units => Rs.5 per unit
- Next 100 units => Rs.7 per unit
- Above 200 units => Rs.10 per unit
Display total bill.
Input:
Enter Customer Id : 301
Enter Name : Suresh
Enter Units : 250

Output:
Customer Id : 301
Name : Suresh
Units : 250
Total Bill : Rs. 1850

Explanation:
A class ElectricityBill is created with customerId, name, and units.
Bill is calculated in slabs:
- First 100 units : 100 * 5 = 500
- Next 100 units : 100 * 7 = 700
- Remaining units : (250 - 200) = 50 units * 13 = 650
- Total Bill = 500 + 700 + 650 = 1850
The if-else conditions check: if units > 200, add slabs progressively.
This program demonstrates tiered calculation logic with class objects.

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

class Q7_Bill
{
	int i;
	String n;
	int u;
	int t;
	Scanner sc = new Scanner(System.in);
	
	void get()
	{
		System.out.println("Enter Customer Id : ");
		i = sc.nextInt();
		System.out.println("Enter Name : ");
		n = sc.next();
		System.out.println("Enter Units : ");
		u = sc.nextInt();
		sc.close();
	}

	void display()
	{
		if(u <= 100) t = u * 5;
		else if(u > 100 && u <= 200) t = 100 * 5 + (u - 100) * 7;
		else t = 100 * 5 + 100 * 7 + (u - 100 - 100) * 13;

		System.out.println("Customer Id : " + i);
		System.out.println("Name : " + n);
		System.out.println("Units : " + u);
		System.out.println("Total Bill : " + t);
	}
}

public class Q7_Electricity_Bill_Calculator
{
	public static void main(String X[])
	{
		Q7_Bill b = new Q7_Bill();
		b.get();
		b.display();
	}
}