/*
Question 45: Write a Java program to implement Transport Management System using Array of Objects.
Create a POJO class Vehicle with attributes vehicleId, distance, and fuelUsed.
Store vehicle records using array of objects.
Perform:
1. Calculate fuel efficiency (Efficiency = distance / fuelUsed)
2. Find vehicle with best efficiency
Input:
Enter number of vehicles : 2

Vehicle Id : 101 Distance : 300 Fuel Used : 20
Vehicle Id : 102 Distance : 250 Fuel Used : 10

Output:
Vehicle 101 Efficiency : 15.0
Vehicle 102 Efficiency : 25.0
Best Efficiency Vehicle : 102

Explanation:
Vehicle veh[] = new Vehicle[2] creates array. Each veh[i] = new Vehicle().
Efficiency = distance / fuelUsed (use double for decimal results).
Vehicle 101: 300 / 20 = 15.0
Vehicle 102: 250 / 10 = 25.0
Best efficiency: 25.0 > 15.0 => Vehicle 102 has best fuel efficiency.
All efficiencies are printed first, then the best one is displayed.
This models a transport fleet management system using array of objects.

Asked In Companies:
Practice assignment
*/

import java.util.Scanner;

class Q45_POJO
{
	private int i;
	private int d;
	private int f;

	public void setI(int i)
	{
		this.i = i;
	}

	public int getI()
	{
		return i;
	}

	public void setD(int d)
	{
		this.d = d;
	}

	public int getD()
	{
		return d;
	}

	public void setF(int f)
	{
		this.f = f;
	}

	public int getF()
	{
		return f;
	}
}

public class Q45_Vehicle
{
	public static void main(String X[])
	{
		int j, n, m;
		int k = 0;
		int a = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of vehicles : ");
		n = sc.nextInt();
		Q45_POJO[] v = new Q45_POJO[n];

		for(j = 0; j < n; j++)
		{
			v[j] = new Q45_POJO();

			System.out.println("Enter Vehicle Id : ");
			v[j].setI(sc.nextInt());

			System.out.println("Enter Distance : ");
			v[j].setD(sc.nextInt());

			System.out.println("Fuel Used : ");
			v[j].setF(sc.nextInt());
		}

		sc.close();
		for(j = 0; j < n; j++)
		{
			m = v[j].getD() / v[j].getF();
			System.out.println("Vehicle " + v[j].getI() + " Efficiency : " + m);

			if(a < m)
			{
				a = m;
				k = v[j].getI();
			}
		}

		System.out.println("Best Efficiency Vehicle : " + k);
	}
}