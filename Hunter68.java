package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class Hunter68 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int x[]=new int[n];	
	int store[]=new int[n];
	int difference[]=new int[n];
	for(int i=0;i<n;i++){
		x[i]=sc.nextInt();
		store[i]=x[i];
	}
	for(int i=0;i<n-1;i++){
		 difference[i]=Math.abs(x[i]-x[i+1]);
		}Arrays.sort(difference);
		for(int i=0;i<n-1;i++){
			if((Math.abs(x[i]-x[i+1]))==difference[n-1]){
				System.out.println(i);System.out.println("V"+difference[n-1]);
			}
			}
	}

}
