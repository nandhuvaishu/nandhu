package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class Player210 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();int sum=0;int count=0;
		String a=Integer.toString(n);
		int aa[]=new int[a.length()];
		for(int i=0;i<a.length();i++){
			aa[i]=Character.getNumericValue(a.charAt(i));
		}
		Arrays.sort(aa);
	for(int j=0;j<a.length();j++){
		System.out.print(aa[j]);}
	}

}
