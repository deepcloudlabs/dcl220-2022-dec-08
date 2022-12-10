package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Exercise2 {
	public static void main(String[] args) throws Exception {
		try (FileInputStream fis = new FileInputStream(new File("src", "jack.dat"));
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			var jack = (Employee)ois.readObject();
			System.out.println(jack);
		}
	}
}

