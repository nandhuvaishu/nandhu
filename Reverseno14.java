package guvi;

import java.util.Scanner;

public class Reverseno14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		for(int i=a.length()-1;i>=0;i--){
			if(!(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')){
		
				System.out.print(a.charAt(i));
			}}

	}

}
