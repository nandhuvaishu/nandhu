import java.util.Scanner;

public class Prime12 {

	public static void main(String[] args) {
		int a,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		a=sc.nextInt();
		for(int i=2;i<=a/2;i++){
			if(a%i==0){
				flag=1;
			}}
		if(flag==0){
			System.out.println("Prime Number");}
		else{
			System.out.println("not a prime number");
		}
	}
}
