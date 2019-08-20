package com.BridgeLabz.Day3;

public class ExtendBinary {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int nb;
		nb=((n & 0x0F)<<4 | (n & 0xF0)>>4);
		System.out.println(n+"="+(Integer.toBinaryString(n)));
	
		System.out.println(nb+"="+(Integer.toBinaryString(nb)));
	  if (nb == 0) {
			  System.out.println("Resultant is 0");
		  }
	  
	  	int resultantno=nb;
        while (nb >0) { 
            if (nb % 2 == 0) {
	         
	            	nb = nb / 2; 
	       //System.out.println(nb);
	        } 
            
        
        System.out.println("nb="+nb);
        
        if (nb==1) {
        	System.out.println(resultantno+" is power of 2");
        	break;
        }
        	
        else {
        		System.out.println(resultantno+" is not power of 2");
        		
        	}
      
        System.out.println(nb+" is Multiple of 2");
		

	
        }

}
}
