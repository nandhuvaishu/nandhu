package guvi;

import java.util.Scanner;

public class Squarepro35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();int b=0;
for(int h=0;h<a;h++){
	System.out.print("*"+" ");
}System.out.println();
for(int i=1;i<a-1;i++){
	for(int j=0;j<a;j++){
		if((b<j)&&(a-1>j)){
			System.out.print("  ");
		}else{
			System.out.print("*"+" ");
			}
	}System.out.println((" "));
}
for(int h=0;h<a;h++){
	System.out.print("*"+" ");
}System.out.println();}

}
