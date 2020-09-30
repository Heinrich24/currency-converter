package com.scooby24.main;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*
 * Takes an input value of type double and converts to the following currency types:
 * 	* US
 * 	* India
 * 	* China
 * 	* France
 */
public class ConvertMain {

	public static void main(String[] args) {
		System.out.println("Please input currency value and press enter to proceed with processing");
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		NumberFormat currencyFormatterUs = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat currencyFormatterIndia = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		NumberFormat currencyFormatterChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat currencyFormatterFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);

		System.out.println("US: " + currencyFormatterUs.format(payment));
		System.out.println("India: " + currencyFormatterIndia.format(payment));
		System.out.println("China: " + currencyFormatterChina.format(payment));
		System.out.println("France: " + currencyFormatterFrance.format(payment));
	}

}
