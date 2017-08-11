package guvi;

import java.util.Scanner;

public class No43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.next();int f=0,f2=0;
		String a1[]=new String[100];	String a2[]=new String[100];
		for(int i=0;i<a.length();){
			if((a.charAt(i)>='a'&&a.charAt(i)<='z')||(a.charAt(i)>'A'&&a.charAt(i)<='Z')){
				a1[f]=Character.toString(a.charAt(i));f++;i++;
	//	System.out.println(a1[f]);	
		}else{
				if(i==a.length()-1){a2[f2]=Character.toString(a.charAt(i));f2++;i=i+1;}
				else{
					if((a.charAt(i)>='1'&&a.charAt(i)<='9')&&(a.charAt(i+1)>='1'&&a.charAt(i+1)<='9')){
					a2[f2]=Character.toString(a.charAt(i))+Character.toString(a.charAt(i+1));
					//System.out.println(a2[f2]);
					//System.out.println(f2);
					f2++;
					i=i+2;
				}else{
					
					a2[f2]=Character.toString(a.charAt(i));//System.out.println(f2);
					//System.out.println(a2[f2]);
					f2++;i=i+1;
					
				}}
			}//System.out.println(f2);
		}
	for(int q=0;q<f2;q++){
		for(int u=0;u<Integer.parseInt(a2[q]);u++){
			System.out.print(a1[q]);
		}
	}
		
	}

}
