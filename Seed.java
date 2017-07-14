import java.util.Scanner;

public class Seed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
int sum=123,a=0;
int x1=x;
while(x!=0){
	a=x%10;
	sum=sum*a;
	x=x/10;
	
}
//System.out.println(sum);
if(sum==y){
	System.out.println(x1+" "+"is a seed of"+" "+y);
}else{
	System.out.println(x1+" "+"is not a seed of"+" "+y);
}
	}

}
