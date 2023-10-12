package org.tnsifGenericInterface;

public interface MinMax<T extends Comparable <T>>
{
	T getMinimum();
	T getMaximum();
	
}
