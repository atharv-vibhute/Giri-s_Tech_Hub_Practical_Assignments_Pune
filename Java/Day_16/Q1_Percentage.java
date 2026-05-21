/*
Example: WAP to input six subject marks of student and 
Calculate its percentage and check its grade using the following rules 
If per >70 && per<=100 - 
 Distinction 
Else if per >60 && per<=70
	 First Division 
Else if per>50 && per<=60 
 Second division 
Else if per>35 && per<=50
	 Third division 
Else 
	Fail 
*/

public class Q1_Percentage
{
	public static void main(String X[])
	{
		int m1 = Integer.parseInt(X[0]);
		int m2 = Integer.parseInt(X[1]);
		int m3 = Integer.parseInt(X[2]);
		int m4 = Integer.parseInt(X[3]);
		int m5 = Integer.parseInt(X[4]);
		int m6 = Integer.parseInt(X[5]);
		float p = ((float)m1+m2+m3+m4+m5+m6)/6;
		
		if(p>70 && p<=100)
		{
			System.out.println("Distinction");
		}	
		else if(p>60 && p<=70)
		{
			System.out.println("First Division");
		}	
		else if(p>50 && p<=60)
		{
			System.out.println("Second Division");
		}
		else if(p>35 && p<=50)
		{
			System.out.println("Third Division");
		}
		else 
		{
			System.out.println("Fail");
		}
	}
}