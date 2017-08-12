package guvi;

import java.util.Scanner;

public class Sumno102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
String hh=Integer.toString(a);System.out.println(hh);
int h=1;int sum=0;
int b=(int)(Math.log10(a))+1;
int []r=new int[b];
//System.out.println(b);
for(int i=0;i<b;i++){
h=h*10;	
}//System.out.println(h);
	for(int i=0;i<b;i++){
		r[i]=Character.getNumericValue(hh.charAt(i));
		System.out.println(r[i]);
		}
	for(int j=0;j<b;j++){
		for(int k=0;k<=j;k++){
			sum=sum+r[k];
			
		}
	}
	System.out.println(sum);}

}
