package com.BridgeLabz.Day3;
import java.util.Scanner;


public class RollDie {

	public static void main(String[] args) {
		
			int min=1;
			int max=6;
			Scanner in =new Scanner(System.in);
			int roll=0;
			
			int n = in.nextInt(); 
			int[] arr= new int [n];
			
			for(int i=0;i<n;i++) 
			{
				roll = (int)( (Math.random() * max)) + 1;
				System.out.println(roll);
	        }
			
			 for(int i=0; i<n; i++) {
		         arr[i] = in.nextInt(roll);
		         System.out.println(arr[i]);

		}
	}

}


