package com.example;

public class Exercise03 {

	public static void main(String[] args) {
		// http://binkurt.blogspot.com/2014/09/string-deduplication.html
		// XX:+UseStringDeduplication -> G1GC, ZGC
		// -XX:+PrintStringDeduplicationStatistics
		String city1= "izmir"; // constant [object==>String] pool
		String city2= new String("izmir");
		String city3= "izmir";
		city2 = city2.intern(); // internalize -> pool
		System.out.println("city1==city2? : "+(city1==city2));
		System.out.println("city1==city3? : "+(city1==city3));
	}

}
