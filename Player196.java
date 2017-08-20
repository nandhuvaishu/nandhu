package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class Player196 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();int sum=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			
		}Arrays.sort(a);
		System.out.println(a[0]);
		
	}

}
