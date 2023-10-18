package org.tnsif.stream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasics {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList=Arrays.asList(1,2,3,4);
		System.out.println("List:"+intList);
		List<Integer> sqrList=new ArrayList<Integer>();
		for (int no : intList) {
			sqrList.add(no*no);
		}
		System.out.println("Square:"+sqrList);
		
		//Using stream api
		List<Integer> cubeList;
		cubeList=intList.stream().map(x->x*x*x).collect(Collectors.toList());
		System.out.println("Cube:"+cubeList);
		
		Stream<Integer> intStream=intList.stream();
		intStream=intStream.map(x->x*x*x);
		cubeList=intStream.collect(Collectors.toList());
		System.out.println("Cube:"+cubeList);
//		System.out.println("Count:"+intStream.count());
	}

}
