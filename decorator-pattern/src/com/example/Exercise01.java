package com.example;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Exercise01 {
	public static void main(String[] args) throws Exception {
		try (FileOutputStream fos = new FileOutputStream(new File("src", "jack.dat"));
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			var jack = new Employee("1", "jack bauer");
			oos.writeObject(jack);
		}
	}
}

record Employee(String identity, String fullname) implements Serializable {
}
