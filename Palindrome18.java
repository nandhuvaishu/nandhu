import java.util.Scanner;

public class Palindrome18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,rev=0,n,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		a=sc.nextInt();b=a;
		while(a!=0){
			n=a%10;
			rev=rev*10+n;
			a=a/10;}
		if(b==rev){
		System.out.print(b+"is a palindrome");

	}else{
System.out.println(b+"is not a palindrome");
}
}}