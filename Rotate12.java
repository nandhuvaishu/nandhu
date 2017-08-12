package guvi;

import java.util.Scanner;

public class Rotate12 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=0;
		int m=1;
		int k=sc.nextInt();
		int n[]=new int[a];
		for(int i=0;i<a;i++){
			n[i]=sc.nextInt();
		}
		
	int h=a-k;for(int k1=h;k1<a;k1++){
		
	
		System.out.print(n[k1]+" ");
	
	}for(int y=0;y<h;y++){
		System.out.print(n[y]+" ");
	}

}}
