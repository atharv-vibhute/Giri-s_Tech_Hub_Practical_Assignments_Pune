/*
Q27. Write a java program to input marks of five subjects Physics, Chemistry, Biology,
        Mathematics and Computer, calculate percentage and grade according to given conditions:
                    	percentage >= 90% : Grade A
                    	percentage >= 80% : Grade B
                    	percentage >= 70% : Grade C
                    	percentage >= 60% : Grade D
                    	percentage >= 40% : Grade E
                    	percentage < 40% : Grade F	
*/

public class Q27_Percentage_Grade
{
	public static void main(String X[])
	{
		int ph = Integer.parseInt(X[0]);
		int ch = Integer.parseInt(X[0]);
		int b = Integer.parseInt(X[0]);
		int m = Integer.parseInt(X[0]);
		int cs = Integer.parseInt(X[0]);

		int tm = ph + ch + b + m + cs ;
		float pe = (float)tm / 5;

		if(pe<=100 && pe>=90)
		{
			System.out.println("Grade A");
		}
		else if(pe<90 && pe>= 80)
		{
			System.out.println("Grade B");
		}
		else if(pe<80 && pe>=70)
		{
			System.out.println("Grade C");
		}
		else if(pe<70 && pe>=60)
		{
			System.out.println("Grade D");
		}
		else if(pe<60 && pe>=40)
		{
			System.out.println("Grade E");
		}
		else if(pe<40 && pe>=0)
		{
			System.out.println("Grade F");
		}
	}
}
