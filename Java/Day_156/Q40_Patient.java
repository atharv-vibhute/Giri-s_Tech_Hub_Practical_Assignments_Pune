/*
2. Find patient with highest bill
Input:
Enter number of patients : 3

Patient Id : 1 Age : 65 Bill : 12000
Patient Id : 2 Age : 40 Bill : 9000
Patient Id : 3 Age : 72 Bill : 15000

Output:
Patients above age 60 : 2
Highest Bill Amount : 15000

Explanation:
Patient pat[] = new Patient[3] creates array. Each pat[i] = new Patient().
Count above 60: loop, if getAge() > 60 => count++.
Patient 1 (age 65) and Patient 3 (age 72) => count = 2.
Highest bill: compare getBillAmount() of all patients.
12000 vs 9000 vs 15000 => 15000 is highest (Patient 3).
This program demonstrates counting and max-finding in array of objects.

Asked In Companies:
Practice assignment
*/

import java.util.Scanner;

class Q40_POJO
{
	private int i;
	private int a;
	private int b;

	public void setI(int i)
	{
		this.i = i;
	}

	public int getI()
	{
		return i;	
	}

	public void setA(int a)
	{
		this.a = a;
	}

	public int getA()
	{
		return a;
	}

	public void setB(int b)
	{
		this.b = b;
	}

	public int getB()
	{
		return b;
	}
}

public class Q40_Patient
{
	public static void main(String X[])
	{
		int i, n;
		int p = 0;
		int m = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of patients: ");
		n = sc.nextInt();

		Q40_POJO[] c = new Q40_POJO[n];

		for(i = 0; i < n; i++)
		{
			c[i] = new Q40_POJO();

			System.out.println("Patient ID: ");
			c[i].setI(sc.nextInt());

			System.out.println("Age: ");
			c[i].setA(sc.nextInt());

			System.out.println("Bill: ");
			c[i].setB(sc.nextInt());

			if(c[i].getA() >= 60) p++;
			m = Math.max(m, c[i].getB());
		}

		sc.close();
		System.out.println("Patients above age : " + p);
		System.out.println("Highest Bill Amount : " + m);
	}
}