package org.tnsif.synchronization;

public class ShiftArrayELement {
	static int[] shiftTab(int tab[],int tNo)
	{
		int tInd=-1;
		for(int i=0;i<tab.length;i++)
		{
			if(tab[i]==tNo)
			{
				tInd=i;
			}
		}
		
		if(tInd==-1)
		{
			return new int[-1];
		}
		else
		{
			int element=tab[tInd];
			for(int j=tInd;j>0;j--)
			{
				tab[j]=tab[j-1];
			}
			tab[0]=element;
		}
		
		return tab;
	}
	public static void main(String[] args) {
		int tab[]= {2,3,4,1,5};
		System.out.println("Orignal:");
		for(int i:tab)
		{
			System.out.print(i+" ");
		}
		System.out.println("\nModified:");
		int newTab[]=shiftTab(tab,1);
		for(int i:newTab)
		{
			System.out.print(i+" ");
		}
	}

}
