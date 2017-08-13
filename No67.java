package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class No67 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String aa[]=new String[a];
		int h2=0;
		String h[]=new String[a];
		String h1[]=new String[a];
		String h11[]=new String[a];
		int hh=0;
		int b=0;
		int m=1;
		//int k=sc.nextInt();
		int n[]=new int[a];
		for(int i=0;i<a;i++){
			aa[i]=sc.next();
		}
		for(int j=0;j<a;j++){h2=0;
			String s[]=aa[j].split("#");
			for(int k=1;k<s.length;k++){
	
			 h2=h2+Integer.parseInt(s[k]);
			}	 h[hh]=	s[0];//System.out.println(h[0]);
			h1[hh]=Integer.toString(h2);
			h11[hh]=Integer.toString(h2);
			hh++;
		}
		Arrays.sort(h1);
	//System.out.println(h1[hh-1]);//System.out.println(hh);
	for(int e=0;e<hh;e++){
		if(h1[hh-1].equals(h11[e])){
			//System.out.println(h11[e]);
			System.out.println(h[e]);
		}
	}
	}

}
