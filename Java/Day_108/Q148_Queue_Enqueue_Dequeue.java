/*
Question 148: Design a queue using an array. Perform enqueue and dequeue operations.
Input:
Enqueue: 5, 10, 15
Dequeue: 1 element

Output:
Queue: 10 15

Explanation:
Array-based queue uses front and rear pointers to track positions. Enqueue adds at rear, dequeue removes from front and increments front pointer. After enqueuing 5,10,15 and dequeuing once, front points to 10, leaving 10,15 accessible.

Asked In Companies:
Practice Question
*/
import java.util.Scanner;

public class Q148_Queue_Enqueue_Dequeue
{
	static int[] a = new int[3];
	static int f = -1;
	static int r = -1;

	public static void enqueue(int n)
	{
		if(f == -1) f = 0;

		r++;
		a[r] = n;
		System.out.println(n + " element is added successfully");
	}

	public static void dequeue()
	{
		if(f == -1 && r == -1) System.out.println("The queue is empty");
		else
		{
			System.out.println(a[f] + " element deleted sucessfully");
			f++;

			if(f > r)
			{
				f = -1;
				r = -1;
			}
		}
	}

	public static void display()
	{
		int i;

		if(f == -1 && r == -1) System.out.println("The queue is empty");
		else
		{
			System.out.println("The queue is -");

			for(i = f; i <= r; i++) System.out.print(a[i] + " ");
		}
	}

	public  static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int c, n;

		do
		{
			System.out.println("\nStack Operations - ");
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Display");
			System.out.println("4. Exit");

			System.out.println("Enter the choices -");
			c = sc.nextInt();
			
			switch(c)
			{
				case 1:
					if(r == a.length - 1) System.out.println("The Queue is full");
					else
					{
						System.out.println("Enter the element: ");
						n = sc.nextInt();
						enqueue(n);
					}
					break;

				case 2: 
					dequeue();
					break;

				case 3:
					display();
					break;

				case 4:
					sc.close();
					System.out.println("You exited successfully");
					System.exit(0);

				default:
					System.out.println("Wrong Choice");
			}
		}
		while(true);
	}
}