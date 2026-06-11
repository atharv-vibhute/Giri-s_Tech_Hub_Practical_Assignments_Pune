/*
Question 11: Write a Java program to create a Player class and find the player with highest runs.

Description: Create a Player POJO class having playerId, playerName and runs. Initialize using constructor. Store 5 player objects in an array and find the player who scored maximum runs.
INPUT:
Enter Player Details:
Player1: 1 Virat 85
Player2: 2 Rohit 120
Player3: 3 KL 45
Player4: 4 Gill 95
Player5: 5 Hardik 60

OUTPUT:
Highest Run Scorer: Rohit
Runs: 120

EXPLANATION:
Create Player class with playerId, playerName, runs. Use constructor to initialize each player. Create array Player[] players = new Player[5]. Store 5 player objects. Loop through array, find maximum runs and display player name with max runs.

Asked In Companies:
Practice Assignment
*/

import java.util.Scanner;

class Q11_POJO
{
	private int i;
	private String s;
	private int r;
	
	Q11_POJO(int i, String s, int r)
	{
		this.i = i;
		this.s = s;
		this.r = r;
	}

	public String getN()
	{
		return s;
	}

	public int getR()
	{
		return r;
	}
	
}

public class Q11_Player
{
	public static void main(String X[])
	{
		int id, run, i, n, max, index = 0;
		String name;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of playars: ");
		n = sc.nextInt();

		Q11_POJO[] p = new Q11_POJO[n];

		for(i = 0; i < n; i++)
		{
			System.out.println("Enter id, name & run");
			id = sc.nextInt();
			name = sc.next();
			run = sc.nextInt();
			p[i] = new Q11_POJO(id, name, run);
		}

		max = 0;
		for(i = 0; i < n; i++)
		{
			if(max < p[i].getR())
			{
				index = i;
				max = p[i].getR();
			}
		}

		System.out.println("Highest Scorer: " + p[index].getN());
		System.out.println("Highest Runs: " + p[index].getR());
	}
}