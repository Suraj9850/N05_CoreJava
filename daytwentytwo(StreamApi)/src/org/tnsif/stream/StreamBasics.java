package org.tnsif.stream;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasics {
	
	public static void main(String[] args) {
		
		Stream<String> strStream=Stream.of("Soham","Sumit","Mohit");
		strStream.forEach(System.out::println);
		
		List<String> words=Arrays.asList("CAT","CAR","RACECAR","SUS");
		System.out.println("------Name in uppercase------");
		words.stream().map((s)->s.toLowerCase()).forEach(System.out::println);
		System.out.println("Orignal:"+words);
		
		System.out.println("------Orignal------");
		Float f[]= {10.20f,320.2f,45.2f,10.20f,320.2f};
		Stream<Float> floatStream=Arrays.stream(f);
		Consumer<Float> c=(n)->System.out.println("Price i:"+n);
		floatStream.forEach(c);
		
		System.out.println("------Limit------");	
		floatStream=Arrays.stream(f);
		floatStream.limit(2).forEach(c);
		
		System.out.println("------Skip------");
		floatStream=Arrays.stream(f);
		floatStream.skip(2).forEach(c);
		
		System.out.println("------Distinct------");
		floatStream=Arrays.stream(f);
		floatStream.distinct().forEach(c);
		
		
//		List<Integer> intList=Arrays.asList(9,1,2,3,4);
//		System.out.println("List:"+intList);
//		List<Integer> sqrList=new ArrayList<Integer>();
//		for (int no : intList) {
//			sqrList.add(no*no);
//		}
//		System.out.println("Square:"+sqrList);
//		
//		//Using stream api
//		List<Integer> cubeList;
//		cubeList=intList.stream().map(x->x*x*x).collect(Collectors.toList());
//		System.out.println("Cube:"+cubeList);
//		
//		Stream<Integer> intStream=intList.stream();
//		intStream=intStream.map(x->x*x*x);
//		cubeList=intStream.collect(Collectors.toList());
//		System.out.println("Cube:"+cubeList);
////		System.out.println("Count:"+intStream.count());
//		
//		List<String> nameList=Arrays.asList("Soham","Mohit","Sumit");
//		System.out.println("Name:"+nameList);
//		Stream<String> nameStream=nameList.stream();
//		intStream=nameStream.map(name->name.length());
//		cubeList=intStream.collect(Collectors.toList());
//		System.out.println("Length:"+cubeList);
//		
//		//Filter
//		//To filter only odd number from intList[1,2,3,4]
//		intStream=intList.stream();
//		Stream<Integer> result=intStream.filter(n->n%2!=0);
//		List<Integer> rList=result.collect(Collectors.toList());
//		System.out.println("Odd No:"+rList);
//		
//		//filter()-return palindrome strings
//		List<String> words=Arrays.asList("CAT","CAR","RACECAR","SUS");
//		System.out.println("Words:"+words);
//		Stream<String> wordsStream=words.stream();
//		wordsStream=wordsStream.filter(w->w.equals(new StringBuffer(w).reverse().toString()));
//		nameList=wordsStream.collect(Collectors.toList());
////		System.out.println("Total words:"+wordsStream.count());
//		System.out.println("Palindrome Words:"+nameList);
////		String str=new StringBuffer("Hello").reverse().toString();
////		System.out.println(str);
//		
//		//filter()->For even no
//		Predicate<Integer> numbers=(n)->n%2==0;
//		intStream=intList.stream();
////		intStream=intStream.sorted();
//		intStream=intStream.filter(numbers);
//		sqrList=intStream.collect(Collectors.toList());
//		System.out.println("Even no:"+sqrList);
//		
//		//filter()->display student record above 70 percentage
//		List<Student> sList=new ArrayList<Student>();
//		Student st=new Student(101, "Sumit", 90);
//		sList.add(st);
//		st=new Student(102, "Sumit", 71);
//		sList.add(st);
//		st=new Student(103, "Nisha", 63);
//		sList.add(st);
//		st=new Student(104, "Soham", 87);
//		sList.add(st);
//		
//		Predicate<Student> perPredicate=(stud)->stud.getPer()>=70;
//		Stream<Student> studStream=sList.stream();
//		studStream=studStream.filter(perPredicate);
//		List<Student> newList=studStream.collect(Collectors.toList());
//		System.out.println(newList);
//		
//		//reduce()
//		System.out.println(intList);
//		intStream=intList.stream();
//		Optional<Integer> sum=intStream.reduce((x,y)->x+y);
//		System.out.println("Additon:"+sum);
	}

}
