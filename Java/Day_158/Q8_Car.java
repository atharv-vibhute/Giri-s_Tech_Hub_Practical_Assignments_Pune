/*
Question 8: Write a Java program to create a Car class and display car details using constructor.

Description: Create Car POJO class with carId, carName and price. Initialize values using constructor and display car information.
INPUT:
Enter Car Id: 301
Enter Car Name: Swift
Enter Price: 650000

OUTPUT:
Car Details:
Id: 301
Name: Swift
Price: 650000

EXPLANATION:
Create Car class with fields carId, carName, price. Use constructor public Car(int id, String name, int price) to initialize. Create display() method to show all details. Create object new Car(301, "Swift", 650000) and call display().

Asked In Companies:
Practice Assignment
*/

import java.util.Scanner;

class Q8_POJO
{
	private int i;
	private String s;
	private int p;

	Q8_POJO(int i, String s, int p)
	{
		this.i = i;
		this.s = s;
		this.p = p;

		System.out.println("Id: " + i);
		System.out.println("Name: " + s);
		System.out.println("Price: " + p);
	}
}

public class Q8_Car
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int i, p;
		String s;

		System.out.println("Enter Car Id: ");
		i = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Car Name: ");
		s = sc.nextLine();

		System.out.println("Enter Price: ");
		p = sc.nextInt();
		sc.close();

		System.out.println("Car details: ");
		Q8_POJO a = new Q8_POJO(i, s, p);
	}
}
