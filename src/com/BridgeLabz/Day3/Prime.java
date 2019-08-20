package com.BridgeLabz.Day3;



public class Prime {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(args[0]);
		int n2= Integer.parseInt(args[1]);
		//int n = Integer.parseInt(args[2]);
		int flg=0;		 
			 
			//if ((n1<=n) && (n<=n2)){
		System.out.println("Prime nos are:");
			if (n1==1) {
				n1++;
			}
			for (int i=n1;i<=n2;i++) {
				
				flg=0;
				for (int j=2;j<i;j++) {
				
					if (i%j==0) {
						flg=1;
						break;
						}
					
					}
				
					if (flg==0) {
//						System.out.println("Not Prime nos:");
//					}
//					else {
						System.out.println(i);
					}
			}
		
			
	}
		
	}	
