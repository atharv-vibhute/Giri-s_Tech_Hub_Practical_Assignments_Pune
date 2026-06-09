/*
Question 41: Write a Java program to implement Library Book Management using Array of Objects.
Create a POJO class Book with attributes bookId, price, and copies.
Store books using array of objects.
Perform:
1. Find total number of book copies
2. Find book with lowest price
Input:
Enter number of books : 3

Book Id : 101 Price : 500 Copies : 3
Book Id : 102 Price : 350 Copies : 5
Book Id : 103 Price : 600 Copies : 2

Output:
Total Copies : 10
Lowest Price Book : 102

Explanation:
Book books[] = new Book[3] creates array. Each books[i] = new Book().
Total copies: loop, totalCopies += getCopies().
3 + 5 + 2 = 10 total copies.
Lowest price: compare getPrice() of all books.
500 vs 350 vs 600 => 350 is minimum => Book 102.
This teaches summation and minimum search in array of objects.

Asked In Companies:
Practice assignment
*/

import java.util.Scanner;

class Q41_POJO
{
	private int i;
	private int p;
	private int c;

	public void setI(int i)
	{
		this.i = i;
	}

	public int getI()
	{
		return i;
	}

	public void setP(int p)
	{
		this.p = p;
	}

	public int getP()
	{
		return p;
	}

	public void setC(int c)
	{
		this.c = c;
	}

	public int getC()
	{
		return c;
	}
}

public class Q41_Books
{
	public static void main(String X[])
	{
		int j, n;
		int k = 0;
		int z = 0;
		int m = Integer.MAX_VALUE;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of books : ");
		n = sc.nextInt();
		Q41_POJO[] b = new Q41_POJO[n];

		for(j = 0; j < n; j++)	
		{
			b[j] = new Q41_POJO();

			System.out.println("Book Id : ");
			b[j].setI(sc.nextInt());

			System.out.println("Price : ");
			b[j].setP(sc.nextInt());

			System.out.println("Copies : ");
			b[j].setC(sc.nextInt());
			z += b[j].getC();

			if(m > b[j].getP())
			{
				m = b[j].getP();
				k = b[j].getI();
			}			
		}	
		
		sc.close();
		System.out.println("Total Copies : " + z);
		System.out.println("Lowest Price Book : " + k);
	}
}