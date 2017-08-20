package guvi;

import java.util.Scanner;

public class Emailhunter69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		int count=0;
		int a=0;
		int charcount=0;
		int a1=0;int a2=0;int count1=0;
		int at=n.indexOf('@');
		int dot=n.indexOf('.');
		for(int i=0;i<n.length();i++){
			if(n.charAt(i)>='a'&&n.charAt(i)<='z'||n.charAt(i)=='.'||n.charAt(i)==':'||n.charAt(i)=='@'||n.charAt(i)=='&'){
				count=count+1;
			}
		}if(count==n.length()){
			for(int i=0;i<n.length();i++){
				if(n.charAt(i)=='.'){
					a=a+1;
				}if(n.charAt(i)=='@'){
					a1=a1+1;
				}if(n.charAt(i)=='&'){
					a2=a2+1;
				}
				}	if(a<=1&&a1<=1&&a2<=1){
					
					for(int k=at+1;k<dot;k++){
						if(n.charAt(k)>='a'&&n.charAt(k)<='z'){
							charcount=charcount+1;
						}
					}if(charcount==4){
			for(int y=0;y<at;y++){
				count1=count1+1;
			}if(count1>=3&&n.subString&&n.substring(n.length()-3,n.length()).equals("com")){
				System.out.println("Valid Emailid");
			}else{
				System.out.println("In Valid Emailid");
			}
					}else{
						System.out.println("In Valid Emailid");
					}}
				else{
					System.out.println("In Valid Emailid");
				}
			
			
		}else{
			System.out.println("In Valid Emailid");
		}
	}

}
