package guvi;

import java.util.Scanner;

public class Reversehello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
		   String input=sc.nextLine(); 	 
		
			String [] a=input.split(" ");
		    for(int i2=a.length;i2>0;i2--){  
		    	  
	    		  System.out.print(a[i2-1]+" ");
	    		  }  System.out.println("");
	    	 }
	      
	}


