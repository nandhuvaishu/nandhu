package guvi;

import java.util.Scanner;

public class No57pair {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	int count=0;
	for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
	}
	for(int j=0;j<n;j++){count=0;
		for(int k=0;k<n;k++){
			if(a[k]==a[j]){
				count=count+1;
			}
		}
	if(count==1){
		System.out.println(a[j]);}
	}

	}

}
