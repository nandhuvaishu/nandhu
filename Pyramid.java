package guvi;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int str1=sc.nextInt();
		for(int i=0;i<str1;i++){
			for(int i2=0;i2<2;i2++){
			for(int i1=0;i1<str1-i;i1++){
				System.out.print("*");
			}System.out.print(" ");
			}System.out.println(" ");
		}
	}

}
