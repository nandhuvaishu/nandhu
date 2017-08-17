package guvi;

import java.util.Scanner;

public class Queue32 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int x[]=new int[a];
	int x1[]=new int[a];
	int x2[]=new int[a];
	int h=0;
	int duplicate[]=new int[a];
	for(int i=0;i<a;i++){
		x[i]=sc.nextInt();
	}
	for(int i=0;i<a;i++){
		duplicate[i]=x[i];
	}
	while(a>1){
		h=0;
	for(int i=0;i<a;i=i+2){
		x1[h]=x[i];
		h++;
	
	a=h-1;}
	}
	System.out.println(x1[0]);
	System.out.println("position"+" "+"0");
	}

}
