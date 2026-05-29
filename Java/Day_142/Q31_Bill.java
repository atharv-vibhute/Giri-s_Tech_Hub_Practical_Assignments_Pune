/*
Question 31: Write a Java program to implement an Electricity Bill Generator using POJO class.
Create a POJO class Electricity with variables customerId and units.
Calculate bill using slabs:
- First 100 units => Rs.5 per unit
- Next 100 units => Rs.7 per unit
- Above 200 units => Rs.10 per unit
Input:
Enter Customer Id : 501
Enter Units : 250

Output:
Customer Id : 501
Units : 250
Total Bill : Rs. 1850

Explanation:
A POJO class Electricity has private fields: customerId and units.
Setter methods store user input. Getter methods retrieve units for calculation.
Slab-based bill calculation:
- First 100 units : 100 * 5 = 500
- Next 100 units : 100 * 7 = 700
- Remaining units : (250 - 200) = 50 units * 13 = 650
- Total Bill = 500 + 700 + 650 = 1850
If-else conditions check if units > 200, units > 100 to apply slabs.
This program shows POJO with real-world tiered billing logic.

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

class Q31_POJO
{
	private int i, u;

	public void setI(int i)
	{		
		this.i = i;
	}

	public int getI()
	{
		return i;
	}

	public void setU(int u)
	{
		this.u = u;
	}

	public int getU()
	{
		return u;
	}
}

public class Q31_Bill
{
	public static void main(String X[])
	{
		Q31_POJO d = new Q31_POJO();
		Scanner sc = new Scanner(System.in);
		int b;

		System.out.println("Enter Customer Id: ");
		d.setI(sc.nextInt());

		System.out.println("Enter Units : ");
		d.setU(sc.nextInt());

		int u = d.getU();
		int i= d.getI();

		if(u <= 100) b = u * 5;
		else if(u > 100 && u <= 200) b = 100 * 5 + (u - 100) * 7;
		else b = 5 * 100 + 7 * 100 + (u - 200) * 13;

		System.out.println("Customer Id : " + i);
		System.out.println("Units : " + u);
		System.out.println("Total Bill : Rs." + b);
	}
}