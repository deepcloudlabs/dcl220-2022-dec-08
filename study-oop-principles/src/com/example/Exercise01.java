package com.example;

public class Exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface ArithmeticCalculator {
	double add(double x, double y);

	double subtract(double x, double y);

	double multiply(double x, double y);

	double divide(double x, double y);
}

interface LogarithmicCalculator {
	double log2(double value);

	double log10(double value);
}

interface TrigonmetricCalculator {
	double sin(double radian);

	double cos(double radian);

	double tan(double radian);

	double asin(double radian);

	double acos(double radian);

	double atan(double radian);

	double sinh(double radian);

	double cosh(double radian);
}

interface UnitCalculator {
	double kg2Pound(double value);

	double km2Mile(double value);
}

interface ExponentialCalculator {
	double powe(double x);
}

interface Calculator extends ArithmeticCalculator, TrigonmetricCalculator, UnitCalculator, ExponentialCalculator,
		LogarithmicCalculator {
}

class UniversalCalculator implements Calculator {

	@Override
	public double add(double x, double y) {
		return 0;
	}

	@Override
	public double subtract(double x, double y) {
		return 0;
	}

	@Override
	public double multiply(double x, double y) {
		return 0;
	}

	@Override
	public double divide(double x, double y) {
		return 0;
	}

	@Override
	public double sin(double radian) {
		return 0;
	}

	@Override
	public double cos(double radian) {
		return 0;
	}

	@Override
	public double tan(double radian) {
		return 0;
	}

	@Override
	public double asin(double radian) {
		return 0;
	}

	@Override
	public double acos(double radian) {
		return 0;
	}

	@Override
	public double atan(double radian) {
		return 0;
	}

	@Override
	public double sinh(double radian) {
		return 0;
	}

	@Override
	public double cosh(double radian) {
		return 0;
	}

	@Override
	public double kg2Pound(double value) {
		return 0;
	}

	@Override
	public double km2Mile(double value) {
		return 0;
	}

	@Override
	public double powe(double x) {
		return 0;
	}

	@Override
	public double log2(double value) {
		return 0;
	}

	@Override
	public double log10(double value) {
		return 0;
	}
}

class StandardCalculator implements ArithmeticCalculator, UnitCalculator {

	@Override
	public double kg2Pound(double value) {
		return 0;
	}

	@Override
	public double km2Mile(double value) {
		return 0;
	}

	@Override
	public double add(double x, double y) {
		return x + y;
	}

	@Override
	public double subtract(double x, double y) {
		return x - y;
	}

	@Override
	public double multiply(double x, double y) {
		return x * y;
	}

	@Override
	public double divide(double x, double y) {
		return x / y;
	}

}