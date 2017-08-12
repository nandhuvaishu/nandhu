package guvi;

import java.util.Scanner;

public class No75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
int  a=sc.nextInt();
int r[]=new int[a];
for(int i=0;i<a;i++){
	r[i]=sc.nextInt();
}for(int i=0;i<a-1;i++){
	if(r[i]>r[i+1]){
		System.out.print(r[i+1]+" ");
		
	}else{
		System.out.print("-1"+" ");
	}
}
System.out.print("-1");
	}

}
