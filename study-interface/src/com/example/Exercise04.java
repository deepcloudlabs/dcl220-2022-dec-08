package com.example;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Exercise04 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// since Java 8: FP -> Higher Order Function, Pure Function
		var numbers = List.of(4,8,15,16,23,42);
		// Functional Interface -> interface -> Single Abstract Method
		int x = 0;
		Another another = new Another();
		Predicate<Integer> ifEven = t -> t%2 == 0;
		Predicate<Integer> ifOdd = Predicate.not(ifEven);
		Predicate<Integer> divisibleTo7 = t -> t%7 == 0;
		Function<Integer,Long> toCube = u -> Long.valueOf(u*u*u) ;
		BinaryOperator<Long> accumulate = (s,v) -> s+v;
		Optional<Long> sum = 
		numbers.stream()
//		       .filter(another::isEven) // HoF
//		       .filter(Another::ciftMi) // HoF
//		       .filter(Utility::isEven) // HoF
		       .filter(ifOdd.and(divisibleTo7))
		       .map(toCube)
		       .reduce(accumulate);
		Consumer<Long> printToConsole = System.out::println;
		sum.ifPresent(printToConsole);
	}

}

interface NumberUtility {
	static boolean ciftMi(int u) {
		return u%2 == 0;
	}
}

class Another {
	static boolean ciftMi(int u) {
		return u%2 == 0;
	}	
	public boolean isEven(int u) {
		return u%2 == 0;
	}	
}