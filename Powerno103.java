package guvi;

import java.util.Scanner;

public class Powerno103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
String s=Integer.toString(a);int r=0;int m=1;
int l=Character.getNumericValue(s.charAt((s.length()-1)));
//System.out.println(l);
for(int j=0;j<s.length();j++){m=1;
for(int i=0;i<l;i++){
	m=m*Character.getNumericValue(s.charAt(j));
	
}//System.out.println(m);
	r=r+m;
	
}System.out.println(r);
	}

}
