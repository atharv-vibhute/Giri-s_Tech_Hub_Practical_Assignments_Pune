/*
Q37. Check whether the month number is valid and display season.
    Input: 1 to 12
    Logic: if-else if to map to Winter/Spring/Summer/Autumn.
    Output: Season.  
*/

public class Q37_Season
{
	public static void main(String X[])
	{
		int m = Integer.parseInt(X[0]);
		if(m==10 || m==11 || m==12)
		{
			System.out.println("Winter");
		}
		else if(m==1 || m==2 || m==3)
		{
			System.out.println("Spring");
		}
		else if(m==4 || m==5 || m==6)
		{
			System.out.println("Summer");
		}
		else if(m==7 || m==8 || m==9)
		{
			System.out.println("Autumn");
		}
	}
}