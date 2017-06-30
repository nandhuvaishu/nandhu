import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
					Scanner sc=new Scanner(System.in);
					int fact=1,i=1;
					System.out.println("Enter the number");
					int a=sc.nextInt();
					while(i<=a){
					fact=fact*i;
					i++;}
					System.out.println(fact);
	}

}
