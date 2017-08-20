package guvi;

import java.util.Scanner;

public class Hunter64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("amount:");
int n=sc.nextInt();int note=0;int rem=0;int count=0;
int []rs={500,100,50,10,1};
for(int i=0;i<rs.length;i++){note=0;
	if(n>=rs[i]){
		note=n/rs[i];
		rem=n%rs[i];
		//System.out.println(note);
	}else{
		rem=n;
	}count+=note;
	n=rem;
}
System.out.println(count);
	}

}
