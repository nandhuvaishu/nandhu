package guvi;

import java.util.Scanner;

public class No60 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];int a1[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();}
		for(int i=0;i<n;i++){
			a1[i]=sc.nextInt();}
		for(int j=0;j<n;j++){
			if(a1[0]==a[j]){
				int g=n-j;
				System.out.println(g);
			}
		}

	}

}
