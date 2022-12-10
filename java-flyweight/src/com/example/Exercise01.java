package com.example;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Exercise01 {

	private static List<Integer> numbers;

	public static void main(String[] args) {
		int x = 42; // 4-byte
		Integer y = Integer.valueOf(42); // 12-Byte (Header) + 4-byte = 16 Byte 
		x++;
		y++;
		y = Integer.valueOf(y.intValue()+1);
		int[] array = new int[1_000_000]; // 4MB
		numbers = new ArrayList<>(1_000_000);
	}

}
