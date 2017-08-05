package guvi;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);int count=0;double l=0;
int n=sc.nextInt();String b=Integer.toString(n);//System.out.println(b);
while(n!=0){
	
	count++;
	n=n/10;
}
for(int i=0;i<count;i++){
	char a= b.charAt(i);
	int f=a-'0';


l=l+Math.pow(f,i);}System.out.println(l);

}
}