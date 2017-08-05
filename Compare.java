package guvi;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count=0;
int a[]=new int[n];
for(int i=0;i<n;i++){
	a[i]=sc.nextInt();
	
}for(int i=0;i<n;i++){
	boolean flag =true;
	for(int i1=0;i1<i;i1++){
		if(a[i]==a[i1]){
			flag=false;
		}
	}if(flag){
		for(int i2=0;i2<n;i2++){
			if(a[i]==a[i2])
				count=count+1;
	
		}
		System.out.println(a[i]+" "+count);count=0;}
}}}
