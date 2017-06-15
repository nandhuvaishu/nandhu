package encapsulation;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		Scanner ss=new Scanner(System.in);
		int size=ss.nextInt();int []x=new int[size];
		for(int i=0;i<size-1;i++){
		x[i]=ss.nextInt();}
		for(int j=1;j<x.length;j++){
			if(x[0]==x[j]){
				c++;
			}if(c==1){
				System.out.println("repeated element");
			}else{
				System.out.println(" not a repeated element");

		}}

	}

}
