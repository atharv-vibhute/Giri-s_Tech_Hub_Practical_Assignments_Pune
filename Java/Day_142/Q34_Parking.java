/*
Question 34: Write a Java program to implement a Parking Fee Calculator using POJO class.
Create a POJO class Parking with variables vehicleNumber and hours.
Calculate parking fee:
- First 2 hours => Rs.20 per hour
- Remaining hours => Rs.30 per hour
Input:
Enter Vehicle Number : 1234
Enter Hours : 5

Output:
Vehicle Number : 1234
Parking Fee : Rs. 130

Explanation:
A POJO class Parking has private fields: vehicleNumber and hours.
Setter methods store user input. Getter methods retrieve hours for fee calculation.
Fee logic:
- First 2 hours: 2 * 20 = 40
- Remaining: (5 - 2) = 3 hours * 30 = 90
- Total Fee = 40 + 90 = 130
Condition: if (hours > 2) add (hours - 2) * 30 to the base fee of 40.
If hours = 2, total = 40. If hours = 1, total = 1 * 20 = 20.
This demonstrates POJO with tiered fee calculation logic.

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

class Q34_POJO
{
	private int v, h;

	public void setV(int v)
	{
		this.v = v;
	}

	public int getV()
	{
		return v;
	}

	public void setH(int h)
	{
		this.h = h;
	}

	public int getH()
	{
		return h;
	}
}

public class Q34_Parking
{
	public static void main(String X[])
	{
		Q34_POJO p = new Q34_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Vehicle Number : ");
		p.setV(sc.nextInt());

		System.out.println("Enter Hours : ");
		p.setH(sc.nextInt());

		sc.close();
		int v = p.getV();
		int h = p.getH();
		int b;

		if(h < 2) b = h * 20;
		else b = 2 * 20 + (h - 2) * 30;

		System.out.println("Vehicle Number : " + v);
		System.out.println("Parking Fee : " + b);
	}
}

