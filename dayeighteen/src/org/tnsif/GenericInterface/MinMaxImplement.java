package org.tnsif.GenericInterface;

public class MinMaxImplement<T extends Comparable<T>> implements MinMax {
	T values[];
	@Override
	public Comparable<T> getMinimum() {
		T min=values[0];
		for (int i = 1; i < values.length; i++)
			if (values[i].compareTo(min) < 0)
				min = values[i];
		return min;
		
	}
	public MinMaxImplement(T[] values) {
		super();
		this.values = values;
	}
		// Generic method
		@Override
		public T getMaximum() {
			T max = values[0];
			for (int i = 1; i < values.length; i++)
				if (values[i].compareTo(max) > 0)
					max = values[i];
			return max;
		}

}
