package guvi;

import java.util.Scanner;

public class Hunter173 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String input1=sc.nextLine();
String input2=sc.nextLine();
int jj=0;
String a[]=input1.split(" ");
String b[]=input2.split(" ");
int s[]=new int[a.length];
for(int i=0;i<a.length;i++){
	jj=0;
	for(int j=0;j<b.length;j++){
		if(a[i].equals(b[j])){
			jj=jj+1;
		}
	}if(jj==0){System.out.println(a[i]);
}
	}
}
	}
