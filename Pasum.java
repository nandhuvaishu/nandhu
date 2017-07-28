package guvi;

import java.util.Scanner;

public class Pasum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();

int e=0,sum=0;
while(a!=0){
	e=a%10;
	sum+=e;
	a=a/10;
}
String sum1=Integer.toString(sum);
String reverse=new StringBuffer(sum1).reverse().toString();
//System.out.println(reverse);
if(reverse.equals(sum1)){
	System.out.println("palindrome");
}else{
	System.out.println(" not a palindrome");
}

	}

}
