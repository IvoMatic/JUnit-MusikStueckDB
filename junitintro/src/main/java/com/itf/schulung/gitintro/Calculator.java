package com.itf.schulung.gitintro;

public class Calculator {

	public static double add(double a, double b) {
		return a + b;
	}
	
	public static double multiply(double a, double b) {
		return a * b;
	}
	
	public static double substract(double a, double b) {
		return a - b;
	}
	
	public static double divide(double a, double b) {
		return a / b;
	}
	
	public static boolean isEven(int number) {
		return number % 2 == 0;
	}
	
	public static boolean isUneven(int number) {
		return !isEven(number);
	}
	
	public static double pow(double basis, int exponent) {
		return Math.pow(basis, exponent);
	}
	
	public static String getString(double number) {
		return Double.toString(number);
	}
	
	//What is missing?
	
}
