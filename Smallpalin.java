package guvi;

import java.util.Scanner;

public class Smallpalin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str=str1.toUpperCase();int length=0;
		int count=0,a=0,ss=0;
		String reverse= new StringBuffer (str1).reverse().toString();
		if(str1.equals(reverse)){
		length=str1.length();
			
		}
		else if(!str1.equals(reverse)){
		for(int i=0;i<str.length();i++){
			boolean flag=true;count=0;
			for(int k=0;k<i;k++){
				if(str1.charAt(i)==(str1.charAt(k))){
					flag=false;
			}
				}
			if(flag){
			for(int j=0;j<str1.length();j++){
				if(str1.charAt(i)==(str1.charAt(j))){
					count++;
					
				}
			}
			}
			//System.out.println(count);
			if(count>1&&count!=0){
			
					a=a+count;
				}
			}
		if(a>0){
			if(a<str1.length()){
			int b=a+1;
			length=b/2;
		//	System.out.println(b/2);
		}
			else if(a>=str1.length()){
				length=a;
			//System.out.println(a);
		}
			}
		if(a==0){
			System.out.println("-1");
			}
		}
		if(length>3){	
	if(length%2==0){
		ss=length/2;
	}else{
		ss=length/3;
	}
		}else{
			ss=length;
		}
		System.out.println(ss);
		}

			
	}


