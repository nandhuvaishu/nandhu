package guvi;

import java.util.Scanner;

public class Zero21 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int m=sc.nextInt();
	int n=sc.nextInt();
	int []r=new int[100];
	int []c=new int[100];
	int t=0;
	int a[][]=new int[m][n];
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
			a[i][j]=sc.nextInt();
			}System.out.println();
	}
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
			if(a[i][j]==0){
				r[t]=i;//System.out.println(r[t]);
				c[t]=j;//System.out.println(c[t]);
				t++;
			}
	}}//System.out.println(t);

	for(int l1=0;l1<t-1;l1++){
			for(int i=0;i<m;i++){
	if(i==r[l1]){
		for(int j=0;j<n;j++){
			a[i][j]=0;
		}
	}
		
			}}for(int l1=0;l1<t-1;l1++){
				for(int i=0;i<n;i++){
					if(i==c[l1]){
						for(int j=0;j<n;j++){
							a[j][i]=0;
						}
					}
						
							}}
			for(int g=0;g<m;g++){
								for(int g1=0;g1<n;g1++){
									System.out.print(a[g][g1]+" ");
								}System.out.println();
							}sc.close();
	
}}
