package guvi;

import java.util.Scanner;

public class Player206 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();String re="";
	for(int i=0;i<s.length();i++){
		if(Character.isUpperCase(s.charAt(i))){
			re=re+Character.toLowerCase(s.charAt(i));
		}else{
		re=re+Character.toUpperCase(s.charAt(i));}
	}
System.out.println(re);
	}

	

}
