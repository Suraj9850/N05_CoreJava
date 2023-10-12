package org.tnsifGenericInterface;

public class MinMaxImplement<T extends Comparable<T>> implements MinMax {
	T values[];
	@Override
	public Comparable<T> getMinimum() {
		T min=values[0];
		for(int i=1;i<values.length;i++)
		{
			if(min.compareTo(values))
			{
				
			}
		}
		return null;
	}

	@Override
	public Comparable<T> getMaximum() {
		// TODO Auto-generated method stub
		return null;
	}

}
