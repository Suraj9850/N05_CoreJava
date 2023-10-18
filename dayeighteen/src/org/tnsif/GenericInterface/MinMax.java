package org.tnsif.GenericInterface;

public interface MinMax<T extends Comparable <T>>
{
	T getMinimum();
	T getMaximum();
	
}
