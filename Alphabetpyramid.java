package guvi;

import java.util.Scanner;

public class Alphabetpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		String input=sc.next();
		for(int i=0;i<input1;i++){
			for(int i1=0;i1<input1;i1++){
				
				//System.out.print(input.charAt(i1));
			}//System.out.println(" ");
		}System.out.println(input);
		for(int i=0;i<input1/2;i++){
			for(int i1=0;i1<input1;i1++){
				if(input1/2+i>=i1&&input1/2-i<=i1){
					System.out.print(" ");
				}else{
					System.out.print(input.charAt(i1));
				}
			}System.out.println(" ");
		}
		for(int i=input1/2-1;i>0;i--){
			for(int i1=0;i1<input1;i1++){
				if(input1/2-i+1<=i1&&input1/2+i-1>=i1){
					System.out.print(" ");
				}else{
					System.out.print(input.charAt(i1));
				}
			}System.out.println(" ");
		}System.out.println(input);
	}}
