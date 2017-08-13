package guvi;

import java.util.Scanner;

public class Target24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();}
		int aa=sc.nextInt();
		for(int i=0;i<n-1;i++){
		for(int j=1;j<n;j++){
			if((a[i]+a[j])==aa){
				System.out.println(a[i]+" "+a[j]);
			}}
		}
	}

}
