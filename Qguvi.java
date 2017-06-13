import java.util.Scanner;

public class Qguvi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,opt;
		char c;
		Scanner sc=new Scanner(System.in);
		do{
			
		
		System.out.println("enter the optional");
		opt=sc.nextInt();
		System.out.println("enter the number");
		a=sc.nextInt();
		b=sc.nextInt();
		
	
		
		switch(opt){
		case 1:
			
				System.out.println(a+b);break;
		case 2:
				System.out.println(a-b);
				break;}
		System.out.println("do you want to continue press");
		System.out.println("to terminate press any key");c=sc.next().charAt(0);
		
		}while(c!='Q');
	}

}
