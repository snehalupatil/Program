package com.BridgeLabz.Day3;

public class PrimeFactors {

	public static void main(String[] args) {
		int copyOfNumber = number;
		// initialize a list to contain all the factors
		List factors = new ArrayList();
		// loop from 2 till the number
		for (int currentNumber = 2; currentNumber <= copyOfNumber; currentNumber++) {
			// check if the current loop counter completely divides the number
			if (copyOfNumber % currentNumber == 0) {
				// add it to list
				factors.add(currentNumber);
				// calculate quotient of division
				copyOfNumber /= currentNumber;
				// stop the number from incrementing in next iteration
				currentNumber--;
			}
		}
		return factors;
	   }
	 
	   public static void main(String[] args) {
		System.out.println("Prime factors of 44");
		List primeFactors = calculatePrimeFactors(44);
		for (Integer factor : primeFactors) {
			System.out.println(factor);
		}
	 
		System.out.println("Prime factors of 529");
		primeFactors = calculatePrimeFactors(44);
		for (Integer factor : primeFactors) {
			System.out.println(factor);
		}
	}

}
