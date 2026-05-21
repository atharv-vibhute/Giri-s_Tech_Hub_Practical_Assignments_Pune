/*
 Q26.Write a java program to accept the height of a person in centimeters and categorize the person according to their height.
                       PerHeight < 150.0  : The person is Dwarf. 
                       PerHeight >= 150.0 && PerHeight < 165.0  :   The person is  average heighted.
                       PerHeight >= 165.0 && PerHeight <= 195.0 :  The person is taller.
                        Test Data : 135 
                  	Expected Output :	The person is Dwarf.
*/

public class Q26_Person_Height
{
	public static void main(String X[])
	{
		int h = Integer.parseInt(X[0]);
		if(h>0 && h<150)
		{
			System.out.println("The person Dwarf.");
		}
		else if(h>=150 && h<165)
		{
			System.out.println("The person is average heighted.");
		}
		else if(h>=165 && h<=195)
		{
			System.out.println("The person is taller.");
		}		
	}
}
