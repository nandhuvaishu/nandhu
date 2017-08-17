package guvi;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();String result="";String result1="";
		for(int i=0;i<a.length();i++){
			if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
				result=result+""+a.charAt(i);}else{
					result1=result1+""+a.charAt(i);	
				}
	}
System.out.println(result+""+result1);
}}
