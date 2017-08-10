package guvi;

import java.util.Scanner;

public class Mul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
String a=sc.next();String a1=sc.next();

int b=Integer.parseInt(a);
int b1=Integer.parseInt(a1);
if(b>0&&b1>0){
int c=b*b1;
String x=Integer.toString(c);
System.out.println(x);
}else{
	System.out.println("0");
}
	}

}
