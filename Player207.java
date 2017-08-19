package guvi;

import java.util.Scanner;

public class Player207 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();int sum=0;int count=0;
	int a[]=new int[n];
	for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
		
	}for(int i=0;i<n;i++){
		boolean flag=true;count=0;
		for(int j=0;j<i;j++){
			if(a[i]==a[j]){
				flag=false;
			}
		}if(flag){
			for(int h=0;h<n;h++){
				if(a[i]==a[h]){
					count=count+1;
				}
			}if(count%2!=0){
				System.out.println(a[i]+" count is"+count);
			}
		}
	}

	}

}
