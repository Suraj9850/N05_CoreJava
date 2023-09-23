package org.tnsif.assignmentOne;

public class Reverse {

	public static void main(String[] args) 
	{
		int mary[]= {12,65,87,78,98};
		int pinky[]= {98,78,87,65,12};
		
		int j=pinky.length-1;
		boolean check=true;
		
		for(int i=0;i<mary.length;i++,j--)
		{
			if(mary[i]!=pinky[j])
			{
				check=false;
			}
		}
		
		if(check)
		{
			System.out.println("Yes, it is in reverse order....");
		}
		else
		{
			System.out.println("No, it is not in reverse order....");
		}
	}

}
