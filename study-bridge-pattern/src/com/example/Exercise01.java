package com.example;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class Exercise01 {

	public static void main(String[] args) {
		// 1. Thread       : Runnable, Callable
		// 2. ThreadPooling: Executors.newFixedThreadPool(10), Executors.newCachedThreadPool(),...
		var executor1 = Executors.newFixedThreadPool(10);
		Runnable run1 = () -> {System.out.println("Hello World");};
		executor1.submit(run1);
		Callable<Integer> run2 = () -> 42;
		executor1.submit(run2);
		FutureTask<Integer> run3 = new FutureTask<Integer>(() -> 42);
		executor1.submit(run3);
		var executor2 = Executors.newCachedThreadPool();
		executor2.submit(run1);
		executor2.submit(run2);
		executor2.submit(run3);
	}

}
