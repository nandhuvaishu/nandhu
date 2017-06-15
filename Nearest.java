package encapsulation;

import java.util.Scanner;

public class Nearest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ss=new Scanner(System.in);
int size=ss.nextInt();int []x=new int[size];
for(int i=0;i<size-1;i++){
x[i]=ss.nextInt();}
for(int i=0;i<size-1;i++){for(int j=0;j<size-1;j++){
	if(x[i]+x[j]==0){System.out.println(x[i]+" "+x[j]);
}
	}}}

}
