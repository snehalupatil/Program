package com.BridgeLabz.Logical;

public class HormonicNumber {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		float h=0;
		System.out.println(n);
		for (int i = 2; i <= n; i++) {
			h=h+(float)1/i;
			
		System.out.println("Series=1+"+(float)1/i+h);
		}
}
}
