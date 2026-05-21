/*
Q38. Check whether a student is eligible for scholarship:
    Attendance >= 75% and marks >= 80**
    Input: Attendance %, marks
    Logic: if-else
    Output: Eligible or not. 
*/

public class Q38_Scholarship
{
	public static void main(String X[])
	{
		int a = Integer.parseInt(X[0]);
		int m = Integer.parseInt(X[1]);
		if(a>=75 && m>=80)
		{
			System.out.println("Eligible");
		}
		else
		{
			System.out.println("Not Eligible");
		}
	}
}