/*
Q50. Write a java program to take input array from user and perform all operations in array.
Input Array :  5732  8659  2534  9625  7354  1325
	
Case 1 :  Sort Number In Ascending Order.
	    Output :- 2357  5689  2345  2569  3457  1235 
				
Case 2 : Sort Number In Descending Order.
  Output :- 7532  9865  5432  9652  7543  5321
				
Case 3 : Store sum of digits at same index.
	  Output :-  17  28  14  22  19  11
	
Case 4 : Store the even number at the first and odd number at the last of digit at same index.
	   Output :-  2573  6859  4253  2695  4735  2135
				
Case 5 : Store only prime number at the same index of digit.
	   Output :- 2573  5  253  25  357  235
*/
import java.util.Scanner;

public class Q50_Array_Operation
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the size of the array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		int i, j, k, n, t, z, r, x;
		int c = 0;

		System.out.println("\nEnter the array elements: ");
		for(i = 0; i < s; i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println("\nChoices is given by -");
		System.out.println("1. Sort Number In Ascending Order.");
		System.out.println("2. Sort Number In Descending Order.");
		System.out.println("3. Store sum of digits at same index.");
		System.out.println("4. Store the even number at the first and odd number at the last of digit at same index.");
		System.out.println("5. Store only prime number at the same index of digit.");

		System.out.println("\nEnter your choice: ");
		x = sc.nextInt();
		sc.close();

		n = a[0];
		while(n != 0)
		{
			n = n / 10;
			c++;
		}
		int b[] = new int[c];
		
		switch(x)
		{
			case 1:
				System.out.println("\nCase 1 :  Sort Number In Ascending Order.");
				for(i = 0; i < s; i++)
				{
					n = a[i];

					j = 0;
					while(n != 0)
					{
						b[j] = n % 10;
						n = n / 10;
						j++;
					}

					for(j = 0; j < c - 1; j++)
					{
						for(k = j + 1; k < c; k++)
						{
							if(b[j] > b[k])
							{
								t = b[j];
								b[j] = b[k];
								b[k] = t;
							}
						}
					}
			
					for(j = 0; j < c; j++)
					{
						System.out.print(b[j]);
					}
					System.out.print(" ");
				}

				System.out.println();
				break;

			case 2:
				System.out.println("\nCase 2 : Sort Number In Descending Order.");
				for(i = 0; i < s; i++)
				{
					n = a[i];

					j = 0;
					while(n != 0)
					{
						b[j] = n % 10;
						n = n / 10;
						j++;
					}

					for(j = 0; j < c - 1; j++)
					{
						for(k = j + 1; k < c; k++)
						{
							if(b[j] < b[k])
							{
								t = b[j];
								b[j] = b[k];
								b[k] = t;
							}
						}
					}

					for(j = 0; j < c; j++)
					{
						System.out.print(b[j]);
					}
					System.out.print(" ");
				}

				System.out.println();
				break;

			case 3:
				System.out.println("\nCase 3 : Store sum of digits at same index.");
				for(i = 0; i < s; i++)
				{
					n = a[i];
					z = 0;

					while(n != 0)
					{
						r = n % 10;
						n = n / 10;
						z = z + r;
					}

					a[i] = z;
					System.out.print(a[i] + " ");
				}

				System.out.println();
				break;

			case 4:
				System.out.println("\nCase 4 : Store the even number at the first and odd number at the last of digit at same index.");
				for(i = 0; i < s; i++)
				{
					n = a[i];

					j = 0;
					while(n != 0)
					{
						b[j] = n % 10;
						n = n / 10;
						j++;
					}

					while(b[0] % 2 != 0)
					{
						for(k = 1; k < c; k++)
						{
							if(b[k] % 2 == 0)
							{
								t = b[0];
								b[0] = b[k];
								b[k] = t;
								break;
							}
						}
					}

					while(b[c - 1] % 2 != 1)
					{
						for(k = 0; k < c - 1; k++)
						{
							if(b[k] % 2 == 1)
							{
								t = b[c - 1];
								b[c - 1] = b[k];
								b[k] = t;
								break;
							}
						}
					}

					for(j = 0; j < c; j++)
					{
						System.out.print(b[j]);
					}
					System.out.print(" ");
				}

				System.out.println();
				break;

			case 5:
				System.out.println("\nCase 5 : Store only prime number at the same index of digit.");
				for(i = 0; i < s; i++)
				{
					n = a[i];

					k = 0;
					while(n != 0)
					{
						r = n % 10;
						n = n / 10;
						if(r == 2 || r == 3 || r == 5 || r == 7)
						{
							k = k * 10 + r;
						}
					}

					a[i] = k;
					System.out.print(a[i] + " ");
				}

				System.out.println();
				break;

			default:
				System.out.println("\nChoice is invalid.\n");
		}
	}
}