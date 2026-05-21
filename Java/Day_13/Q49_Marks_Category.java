/*
Q49. Given marks out of 100, print grade using nested ternary operators.
 Input : Marks = 82
 Output : Good
 Explanation : 82 falls in the “Good” category.
*/

public class Q49_Marks_Category
{
	public static void main(String X[])
	{
		int m = Integer.parseInt(X[0]);
		String s = (m<=100 && m>=90)? "Excellent":(m<90 && m>=75)? "Good":(m<75 && m>=60)? "Average":(m<60 && m>=40)? "Pass":(m<40 && m>=0)? "Fail":"Entered number is wrong";
		System.out.println(s);
	}
}