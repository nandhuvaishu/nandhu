import java.util.Arrays;
import java.util.Scanner;

public class Guviminmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc=new Scanner(System.in);
int b=sc.nextInt();
int a[]=new int[b];int c[]=new int[b];
for(int i=0;i<b;i++){
	a[i]=sc.nextInt();
}
Arrays.sort(a);
if(b%2==0){
for(int k=b-1;k>b/2;k--){
	
	System.out.print(a[k]+","+a[b-k-1]+",");
	//c[b-k-1]=a[k];
	//c[b-k]=a[b-k-1];
	}System.out.print(a[b-2]+","+a[b-1]);
	
//c=	(a[k]+" "+a[b-k-1]);

//System.out.println(c);
	}
else{for(int k=b-1;k>b/2;k--){
		System.out.print(a[k]+","+a[b-k-1]+",");}System.out.print(a[b/2]);
}
}}