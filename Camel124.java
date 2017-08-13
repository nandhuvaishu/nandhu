package guvi;

import java.util.Scanner;

public class Camel124 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);int a1=0;
		String a=sc.nextLine();
		for(int i=1;i<a.length();i++){
			if(a.charAt(i)>='A'&&a.charAt(i)<='Z'){
				a1=1;
			}
		}
		if(a1==1){
			System.out.println("the given string is camel case");
		}else{
			System.out.println("the given string is not a camel case");
		}
	}

}
