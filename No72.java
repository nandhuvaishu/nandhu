package guvi;

import java.util.Scanner;

public class No72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
String aa[]=a.split(" ");

if(aa.length%2==0){

	for(int i=0;i<aa.length;i=i+2){
		
		
	
		for(int j=aa[i].length()-1;j>=0;j--){
			System.out.print(aa[i].charAt(j));
			}System.out.print(" ");
			for(int i1=0;i1<aa[i+1].length();i1++){
				System.out.print(aa[i+1].charAt(i1));
			}System.out.print(" ");

	}}
else{
	for(int i=0;i<aa.length-1;i=i+2){
		
		
		
		for(int j=aa[i].length()-1;j>=0;j--){
			System.out.print(aa[i].charAt(j));
			}System.out.print(" ");
			for(int i1=0;i1<aa[i+1].length();i1++){
				System.out.print(aa[i+1].charAt(i1));
			}System.out.print(" ");

	}
	for(int j=aa[aa.length-1].length()-1;j>=0;j--){
		System.out.print(aa[aa.length-1].charAt(j));
		}System.out.print(" ");}
}
}

























