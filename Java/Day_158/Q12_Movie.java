/*
Question 12: Write a Java program to create a Movie class and count how many movies have rating greater than 4.

Description: Create Movie class with movieId, movieName and rating. Initialize using constructor. Store movie objects and count movies having rating above 4.
INPUT:
Enter 4 Movies:
1 Leo 4.5
2 Jawan 3.8
3 Pathan 4.2
4 Tiger 3.5

OUTPUT:
Movies with rating above 4: 2

EXPLANATION:
Create Movie class with fields movieId, movieName, rating. Use constructor to initialize. Create Movie[] array to store movies. Loop through array, check if rating > 4.0 and increment counter. Display count of movies with rating > 4.

Asked In Companies:
Practice Assignment
*/

import java.util.Scanner;

class Q12_Rating
{
	int id;
	double rating;
	String name;

	Q12_Rating(int id, String name, double rating)
	{
		this.id = id;
		this.name = name;
		this.rating = rating;
	}

	public double getRating()
	{
		return rating;
	}
}

public class Q12_Movie
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int i, id, no;
		int count = 0;
		double rating;
		String name;

		System.out.println("Enter number of movies: ");
		no = sc.nextInt();
		Q12_Rating[] m = new Q12_Rating[no];

		for(i = 0; i < no; i++)
		{
			System.out.println("Enter movie id: ");
			id = sc.nextInt();
		
			System.out.println("Enter name: ");
			name = sc.next();

			System.out.println("Enter rating: ");
			rating = sc.nextDouble();
	
			m[i] = new Q12_Rating(id, name, rating);
		}

		sc.close();
		
		for(i = 0; i < no; i++)
		{
			if(m[i].getRating() > 4) count++;
		}

		System.out.println("Movies with rating above 4: " + count);
	}
}

