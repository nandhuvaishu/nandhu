package guvi;

import java.util.Scanner;

public class Player199 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();int sum=0;
		char a[]=new char[n];int count=0;
		for(int i=0;i<n;i++){
			a[i]=sc.next().charAt(0);
			
		}for(int i=0;i<n;i++){count=0;
			for(int i1=0;i1<n;i1++){
				if(a[i]==a[i1]){
					count=count+1;
				}
			}if(count==1){
				System.out.println(a[i]+" ");}
			}
		}
	}


