package com.BridgeLabz.Logical;

public class PowerOf2 {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		System.out.println("Number="+n);
		for (int i = 1; i <= n; i++) {
			System.out.println(Math.pow(2,i));
		}
	}

}
