package guvi;

import java.util.Scanner;

public class Guvi65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int g=sc.nextInt();int r=sc.nextInt();
int a[]=new int[g];int flag=0;int loc=0;
for(int i=0;i<g;i++){
	a[i]=sc.nextInt();
}
for(int i=0;i<g;i++){
	if(a[i]==r){
		break;
	}
	else{
		System.out.println(a[i]);
	}
	}
}
	}

     
