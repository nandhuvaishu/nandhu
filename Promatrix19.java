package guvi;

import java.util.Scanner;

public class Promatrix19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();int a1=sc.nextInt();
		int x[][]=new int[a][a1];
		for(int i=0;i<a;i++){
			for(int j=0;j<a1;j++){
				x[i][j]=sc.nextInt();
			}
		}//sc.nextLine();
		int r=sc.nextInt();int c=sc.nextInt();int r1=sc.nextInt();int c1=sc.nextInt();
		for(int i=r;i<=r1;i++){//System.out.println(i);
			for(int j=c;j<=c1;j++){//System.out.println(j);
				System.out.print(x[i][j]+" ");
			}System.out.println();
		}
	}

}
