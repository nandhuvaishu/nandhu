package guvi;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a =sc.next();
		String b=sc.next();
		String s=a.substring(0,2);String s1=b.substring(0,2);
		System.out.print(s.toUpperCase()+""+s1.toLowerCase());
		if(a.length()==b.length()){
			for(int i=2;i<a.length();i++){
			String d=a.substring(i,i+1);String d1=b.substring(i,i+1);	
			System.out.print(d+""+d1);
		}
	}else if(a.length()<b.length()){
		for(int i=2;i<a.length();i++){
			String d=a.substring(i,i+1);String d1=b.substring(i,i+1);	
			System.out.print(d+""+d1);
	}
		int f=b.length()-a.length();
		if(f!=0){int g=1;
			for(int i=f;i<b.length();i++){
			String d2=b.substring(i,i+1);
			System.out.print(g+""+d2);g++;
		}
	}
}
		}}
