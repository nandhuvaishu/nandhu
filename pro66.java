package guvi;

import java.util.Scanner;

public class pro66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=sc.nextInt();int sum=0;double share=0;
int r[]=new int[n];
for(int i=0;i<n;i++){
	r[i]=sc.nextInt();
}int a=sc.nextInt();
for(int j=0;j<n;j++){
	sum=sum+r[j];
}if(sum/2==a){
	for(int i1=0;i1<n;i1++){
		if(i1==k){
			System.out.println(r[i1]/2);
		}
	}}else{
		System.out.println("Bon Appetit");
	}
}

	}


