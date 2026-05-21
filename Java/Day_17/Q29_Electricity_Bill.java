/*
Q29. Write a java program to input electricity unit charges & calculate total electricity bill according to the given condition
                	For first 50 units Rs. 0.50/unit
                	For next 100 units Rs. 0.75/unit
                	For next 150 units Rs. 1.20/unit
                	For unit above 250 Rs. 1.50/unit
 An additional surcharge of 20% is added to the bill.
*/

public class Q29_Electricity_Bill
{
	public static void main(String X[])
	{
		int e = Integer.parseInt(X[0]);
		float s;
		float b;

		if(e>=0 && e<= 50)
		{
			b = e * 0.5f;
			s = b * 20 / 100;
			b = b + s;
			System.out.println(b);
		}

		if(e>50 && e<=150)
		{
			e = e - 50;
			b = e * 0.75f + 50 * 0.5f;
			s = b * 20 / 100;
			b = b + s;
			System.out.println(b);
		}

		if(e>150 && e<=300)
		{
			e = e - 150;
			b = e * 1.2f + 100 * 0.75f + 50 * 0.5f;
			s = b * 20 / 100;
			b = b + s;
			System.out.println(b);
		}

		if(e>300)
		{
			e = e - 300;
			b = e * 1.5f + 150 * 1.2f + 100 * 0.75f + 50 * 0.5f;
			s = b * 20 / 100;
			b = b + s;
			System.out.println(b);
		}		
	}
}