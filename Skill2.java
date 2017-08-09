package hacker;

import java.util.Scanner;

public class Skill2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int r=sc.nextInt();
int g=sc.nextInt();int f=0;int count=0;
String s[]=new String[g];String s11[]=new String[10000];
for(int i=0;i<g;i++){
	s[i]=sc.next();
}int r1=sc.nextInt();
String s1[]=new String[r1];
for(int i=0;i<r1;i++){
	s1[i]=sc.next();
	}
for(int j=0;j<g;j++){
	for(int j1=0;j1<r1;j1++){
		if(!(s[j].equals(s1[j1]))){
	s11[f]=s[j];
	f++;
		}
	}
}//System.out.println(f);
for(int h=0;h<f;h++){boolean flag=true;count=0;
for(int h1=0;h1<h;h1++){
	if(s11[h].equals(s11[h1])){
		flag=false;
	}
}if(flag){
	for(int h2=0;h2<f;h2++){
		if(s11[h].equals(s11[h2])){count=count+1;
	}
}if(count==r1){//System.out.println(count);System.out.println(r1);
	System.out.println(s11[h]);count=0;}
//System.out.println(f);
}}
}}
