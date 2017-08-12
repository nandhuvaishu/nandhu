package guvi;

import java.util.Scanner;

public class Powerno105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String s=Integer.toString(a);int r=0;int m=1;
		int m1=1;
		int l=Character.getNumericValue(s.charAt((s.length()-1)));
		//System.out.println(l);
		for(int j=0;j<s.length()-1;j++){m=1;
		for(int i=0;i<Character.getNumericValue(s.charAt((j+1)));i++){
			m=m*Character.getNumericValue(s.charAt(j));
			
		}//System.out.println(m);
			
		r=r+m;
			
		}
		for(int i=0;i<Character.getNumericValue(s.charAt((0)));i++){
			m1=m1*Character.getNumericValue(s.charAt(s.length()-1));
			
			}int jj=r+m1;
		System.out.println(jj);
	}

}
