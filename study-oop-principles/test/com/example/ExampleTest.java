package com.example;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class ExampleTest {

	@ParameterizedTest
	@CsvFileSource(resources = "/com/example/sample.csv",delimiter = ':')
	void testAdd(int a, int b, int c) {
		StandardCalculator calculator = new StandardCalculator();
		assertEquals(c, calculator.add(a, b));
	}

}
