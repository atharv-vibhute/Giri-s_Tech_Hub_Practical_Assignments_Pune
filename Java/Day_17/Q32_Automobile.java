/*
Q32. An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A company manager wants to make the production of both types of vehicle according to the given data below:
• 1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
• 2nd data, Total number of wheels = W
The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.
Example :
Input : • 200 -> Value of V
• 540 -> Value of W
Output : • TW =130   FW=70
Explanation: 130+70 = 200 vehicles (70*4)+(130*2)= 540 wheels.
*/

public class Q32_Automobile
{
	public static void main(String X[])
	{
		int v = Integer.parseInt(X[0]);
		int w = Integer.parseInt(X[1]);
		int x = 0;
		int i = -1;
		int b = 0;
		
		while(w != x)
		{
			i++;
			b = v - i;
			x = b*2 + i*4;
		}

		System.out.println("TW = " + b);
		System.out.println("FW = " + i);
	}
}