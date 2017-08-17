package guvi;

import java.util.Scanner;

public class removepl213 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.next();int count=0;
	String result="";
	String b=new StringBuffer(a).reverse().toString();
	for(int i=0;i<b.length();i++){count=0;
		for(int j=i+1;j<b.length();j++){
		if(b.charAt(i)==b.charAt(j)){
			count=count+1;
		}
	}if(count==0){
		result=result+""+b.charAt(i);
	}
	
	}String Oresult=new StringBuffer(result).reverse().toString();
	System.out.println(Oresult);
	sc.close();
	
	}

}
