package org.tnif.interfaceDemo;
//An interface which contain exactly 1 abstract method then that interface known as functional interface

//below annotation ensures that we have to use exactly one abstract method inside an interface

@FunctionalInterface
public interface PopCorn {
	void displayReceipe();
}
