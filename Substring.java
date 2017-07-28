package guvi;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		String a1=b;
		int count=0;
		for(int i=0;i<=a.length()-b.length();i++){
			String s=a.substring(i,b.length()+i);
			if(s.equals(a1)){
				System.out.println(i);
			}else{
				count++;
			}
		}
		if(count==a.length()-b.length()+1){
			System.out.println("-1");
		}
	}}


