/*
Q50. Task: Identify the first digit in a number that does not repeat anywhere else, using only loops.
Example: n = 1213451 → first non-repeating digit = 2
*/

public class Q50_Non_Repeating_Digit
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int f0 = 0;
		int f1 = 0;
		int f2 = 0;
		int f3 = 0;
		int f4 = 0;
		int f5 = 0;
		int f6 = 0;
		int f7 = 0;
		int f8 = 0;
		int f9 = 0;
		int t = n;
		int r;
		int c = 0;
		int b = 0;
		int a = 0;

		if(n >= 0 && n <= 9)
		{
			System.out.println(n);
		}
		else
		{
			for(; t != 0;)
			{
				r = t % 10;
				t = t / 10;
				c++;

				if(r == 1)
				{
					f1++;
				}
				else if(r == 2)
				{
					f2++;
				}
				else if(r == 3)
				{
					f3++;
				}
				else if(r == 4)
				{
					f4++;
				}
				else if(r == 5)
				{
					f5++;
				}
				else if(r == 6)
				{
					f6++;
				}
				else if(r == 7)
				{
					f7++;
				}
				else if(r == 8)
				{
					f8++;
				}
				else if(r == 9)
				{
					f9++;
				}
				else
				{
					f0++;
				}
			}

			t = n;
			for(; t != 0;)
			{
				r = t % 10;
				a = a * 10 + r;
				t = t / 10;
			}

			for(; a != 0;)
			{
				r = a % 10;
				a = a / 10;
				b++;

				if(r == 1 && f1 == 1)
				{
					System.out.println(r);
					break;
				}
				else if(r == 2 && f2 == 1)
				{
					System.out.println(r);
					break;						
				} 
				else if(r == 3 && f3 == 1)
				{
					System.out.println(r);
					break;						
				} 
				else if(r == 4 && f4 == 1)
				{
					System.out.println(r);
					break;						
				} 
				else if(r == 5 && f5 == 1)
				{
					System.out.println(r);
					break;						
				} 
				else if(r == 6 && f6 == 1)
				{
					System.out.println(r);
					break;						
				} 
				else if(r == 7 && f7 == 1)
				{
					System.out.println(r);
					break;						
				} 
				else if(r == 8 && f8 == 1)
				{
					System.out.println(r);
					break;						
				} 
				else if(r == 9 && f9 == 1)
				{
					System.out.println(r);
					break;						
				} 
				else if(c == (b + 1) && f0 == 1)
				{
					System.out.println("0");
					break;
				}
				else if((f0!=1) && (f1!=1) && (f2!=1) && (f3!=1) && (f4!=1) && (f5!=1) && (f6!=1) && (f7!=1) && (f8!=1) && (f9!=1))
				{
					System.out.println("No non-repeating number");
					break;
				}
			}	
		}
	}
}