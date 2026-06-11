/*
Question 3: Write a Java program to demonstrate constructor overloading using a Book class.

Description: Create Book class with bookId, bookName and price. Create one default constructor and one parameterized constructor. Display values initialized by both constructors.
INPUT:
(Default constructor gives default values)
Enter Book Id: 11
Enter Book Name: Java Basics
Enter Price: 450

OUTPUT:
Book from Default Constructor:
Book Id: 0
Book Name: Unknown
Price: 0

Book from Parameterized Constructor:
Book Id: 11
Book Name: Java Basics
Price: 450

EXPLANATION:
Create two constructors: public Book() { bookId=0; bookName="Unknown"; price=0; } and public Book(int id, String name, int p) { bookId=id; bookName=name; price=p; }. Demonstrate both by creating two objects.

Asked In Companies:
Practice Assignment
*/

import java.util.Scanner;

class Q3_Book
{
	Q3_Book()
	{
		System.out.println("Book from Default Constructor");
		System.out.println("Book Id: 0");
		System.out.println("Book Name: Unknown");
		System.out.println("Price: 0");
	}

	Q3_Book(int i, String n, int p)
	{
		System.out.println("Book from Parameterized Contstructor");
		System.out.println("Book Id: " + i);
		System.out.println("Book Name: " + n);
		System.out.println("Price : " + p);
	}
}

public class Q3_Constructor_Overloading
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int i, p;
		String n;

		System.out.println("Enter Book Id: ");
		i = sc.nextInt();
		sc.nextLine(); // Buffer
	
		System.out.println("Enter Book Name: ");
		n = sc.nextLine();

		System.out.println("Enter Price: ");
		p = sc.nextInt();


		sc.close();
		Q3_Book b = new Q3_Book();
		Q3_Book c = new Q3_Book(i, n, p);
	}
}