package com.example;

public class Exercise05 {

	public static void main(String[] args) {
		

	}

}

interface  T {
	void fun();
	default void gun() {}
}

interface U {
	default void gun() {}	
}

class Y implements T,U {

	@Override
	public void fun() {
	}

	@Override
	public void gun() {
		U.super.gun();
	}
	
}