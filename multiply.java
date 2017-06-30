import java.util.Scanner;

public class multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String a=sc.next();
		String b=sc.next();int sum=0;
		int v=Integer.parseInt(a);
		int n=Integer.parseInt(b);
		if(v>0){
			if(n>0){
				sum=v*n;
			}
		}System.out.println(sum);
		
	}

}
