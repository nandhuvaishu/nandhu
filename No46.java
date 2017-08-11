package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class No46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
int d[]=new int[100];
int t=0;
for(int i=1;i<s;i++){
	for(int i1=1;i1<s;i1++){
	if(i+i1==s){
		if(i>i1){
			d[t]=i-i1;
		}else{
			d[t]=i1-i;
		 //System.out.println(d[t]);
		 //System.out.println(t);
		 
		 }t++;
	}
	}//System.out.println(t);
	}
Arrays.sort(d);for(int h=0;h<d.length;h++){
	if(d[h]>0){
	System.out.println(d[h]);break;}
}


}}
