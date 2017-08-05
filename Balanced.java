package guvi;

import java.util.Scanner;

public class Balanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String a =sc.next();int d=0;
for(int i=0;i<a.length();i++){	
	if((a.charAt(i)>='a'&&a.charAt(i)<='m')||(a.charAt(i)>='A'&&a.charAt(i)<='M')){
		 d=a.indexOf(a.charAt(i));break;
	}
}
//System.out.println(d);
if(d==0){
	System.out.println(a+" "+"is not balanced");
}else if(d==a.length()-1){
	System.out.println(a+" "+"is not balanced");
}else{
	if((a.charAt(d-1)>='n'&&a.charAt(d-1)<='z')||(a.charAt(d-1)>='N'&&a.charAt(d-1)<='Z')){
		if((a.charAt(d+1)>='n'&&a.charAt(d+1)<='z')||(a.charAt(d+1)>='N'&&a.charAt(d+1)<='Z')){
			System.out.println(a+" "+"is balanced");}
}}
	}

}
