package com.example;

import java.util.List;

public class Exercise01 {

	public static void main(String[] args) {
		var numbers = List.of(4,8,15,16,23,42);
		System.err.println(numbers.getClass());
		for(var iter = numbers.iterator();iter.hasNext();) {
			System.err.println(iter.getClass());
			var number = iter.next();
			System.out.println(number);
		}
		for (var number : numbers) {
			System.out.println(number);			
		}
	}

}
