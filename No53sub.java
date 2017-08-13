package guvi;

import java.util.Scanner;

public class No53sub {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int g=sc.nextInt();
		for(int i=1;i<a.length();i++){
			String s2=a.substring(0,1);
			String s=a.substring(i,g-1+i);System.out.println(s2+""+s);
		}

	}

}
