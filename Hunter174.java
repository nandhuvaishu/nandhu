package guvi;

import java.util.Scanner;

public class Hunter174 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
		String input2=sc.nextLine();
		int jj=0;int jj1=0;
		String a[]=input1.split(" ");
		String b[]=input2.split(" ");
		for(int i=0;i<b.length;i++){
			jj1=0;
			for(int j=0;j<a.length;j++){
				if(b[i].equals(a[j])){
					jj1=jj1+1;
				}
			}if(jj1==0){System.out.println("output1 "+b[i]);
		}
			}
		for(int i1=0;i1<a.length;i1++){
			jj=0;
			for(int j1=0;j1<b.length;j1++){
				if(a[i1].equals(b[j1])){
					jj=jj+1;
				}
			}if(jj==0){System.out.println("output2 "+a[i1]);
		}
			}
		
	}

}
