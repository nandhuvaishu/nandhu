package guvi;

import java.util.Scanner;

public class Spiralform211pl {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int []r=new int[100];
		int []c=new int[100];
		int t=0;
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				a[i][j]=sc.nextInt();
				}
		}
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
			System.out.print(a[i][j]+" ");
				}
		}

	}

}
