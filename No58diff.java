package guvi;

import java.util.Scanner;

public class No58diff {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=sc.nextInt();
int s[]=new int[n];int count=0;
for(int i=0;i<n;i++){
	s[i]=sc.nextInt();
}
for(int i=0;i<n;i++){
	for(int j=i+1;j<n;j++){
		if(Math.abs(s[i]-s[j])==k){
			count=count+1;
		}
	}
}
System.out.println(count);
	}

}
