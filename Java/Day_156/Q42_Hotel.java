/*
Question 42: Write a Java program to implement Hotel Room Management using Array of Objects.
Create a POJO class Room with attributes roomNumber, pricePerDay, and daysStayed.
Store room records in array of objects.
Perform:
1. Calculate total bill for each room (Bill = pricePerDay * daysStayed)
2. Find room with highest bill
Input:
Enter number of rooms : 2

Room Number : 101 Price Per Day : 1500 Days Stayed : 3
Room Number : 102 Price Per Day : 2000 Days Stayed : 2

Output:
Room 101 Bill : 4500
Room 102 Bill : 4000
Highest Bill Room : 101

Explanation:
Room rooms[] = new Room[2] creates array. Each rooms[i] = new Room().
Bill for each room = pricePerDay * daysStayed.
Room 101: 1500 * 3 = 4500
Room 102: 2000 * 2 = 4000
Highest bill: 4500 > 4000 => Room 101 has highest bill.
Both bills are printed first, then the room with the highest bill is displayed.
This models a hotel billing system using array of objects.

Asked In Companies:
Practice assignment
*/

import java.util.Scanner;

class Q42_POJO
{
	private int n;
	private int p;
	private int d;

	public void setN(int n)
	{
		this.n = n;
	}

	public int getN()
	{
		return n;
	}

	public void setP(int p)
	{
		this.p = p;
	}

	public int getP()
	{
		return p;
	}

	public void setD(int d)
	{
		this.d = d;
	}

	public int getD()
	{
		return d;
	}
}

public class Q42_Hotel
{
	public static void main(String X[])
	{
		int m, i;
		int h = Integer.MIN_VALUE;
		int j = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rooms : ");
		m = sc.nextInt();
		Q42_POJO[] r = new Q42_POJO[m];

		for(i = 0; i < m; i++)
		{
			r[i] = new Q42_POJO();

			System.out.println("Room Number : ");
			r[i].setN(sc.nextInt());
			
			System.out.println("Price Per Day : ");
			r[i].setP(sc.nextInt());

			System.out.println("Days Stayed : ");
			r[i].setD(sc.nextInt());
		}

		sc.close();
		for(i = 0; i < m; i++)
		{
			System.out.println("Room Number Bill : " + (r[i].getP() * r[i].getD()));

			if(h < (r[i].getP() * r[i].getD()))
			{
				h = r[i].getP() * r[i].getD();
				j = r[i].getN();
			}
		}
		System.out.println("Highest Bill Room : " + j);
	}
}