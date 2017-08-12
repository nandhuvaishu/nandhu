package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class No15 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	int aa[]=new int[100];int bb[]=new int[100];
	String s[]=a.split(" ");
	int count=0;
	for(int i=0;i<s.length;i++){count=0;
		for(int i1=0;i1<s[i].length();i1++){
			boolean flag =true;
			
			for(int k=i1+1;k<i1;k++){
				if(s[i].charAt(i1)==s[i].charAt(k)){
					flag=false;
				}
			}if(flag){
				for(int j=i1+1;j<s[i].length();j++){
					if(s[i].charAt(j)==s[i].charAt(i1))
						count=count+1;
						}
			}}
		aa[i]=count;bb[i]=(count);
		//System.out.println(aa[i]);
		
	}Arrays.sort(aa);
	int f=(aa[aa.length-1]);
	//System.out.println(f);
	for(int l=0;l<bb.length;l++){
		if(f==bb[l]){
			System.out.println(s[l]);
		}
	}

	}

}
