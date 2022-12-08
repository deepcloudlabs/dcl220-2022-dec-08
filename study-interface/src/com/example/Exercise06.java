package com.example;

public class Exercise06 {
	public static void main(String[] args) {

	}
}

interface J { // since java 8
	static void fun() {}
	default void gun() {}
}

@SuppressWarnings("unused")
interface K { // since java 9
	private static void sun() {}
	private void run() {}
}
