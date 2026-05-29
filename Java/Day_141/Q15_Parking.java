/*
Question 15: Write a Java program to implement a Parking Fee Calculator.
Create a class Parking with attributes vehicleNumber and hours.
Calculate parking fee:
- First 2 hours => Rs.20 per hour
- Remaining hours => Rs.30 per hour
Display total fee.
Input:
Enter Vehicle Number : MH12AB1234
Enter Hours : 5

Output:
Vehicle Number : MH12AB1234
Parking Hours : 5
Total Parking Fee : Rs. 130

Explanation:
A class Parking is created with vehicleNumber and hours.
The fee calculation uses a slab system:
- For the first 2 hours: 2 * 20 = 40
- Remaining hours: (5 - 2) = 3 hours * 30 = 90
- Total Fee = 40 + 90 = 130
Condition: if (hours > 2), charge Rs.30 per hour for extra time.
If hours = 2, total fee = 2 * 20 = 40 (no extra charge).
This program models a real parking system using class objects and tiered pricing.

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

class Q16_Fee
{
	String v;
	int h, t;
	Scanner sc = new Scanner(System.in);
	
	void get()
	{
		System.out.println("Enter Vehicle Number : ");
		v = sc.next();
		System.out.println("Hours : ");
		h = sc.nextInt();
		sc.close();
	}

	void display()
	{
		if(h > 2) t = (h - 2) * 30 + 2 * 20;
		else t = h * 20;

		System.out.println("Vehical Number : " + v);
		System.out.println("Parking Hours : " + h);
		System.out.println("Total Parking : " + t); 
	}
}

public class Q15_Parking
{
	public static void main(String X[])
	{
		Q16_Fee k = new Q16_Fee();
		k.get();
		k.display();
	}
}