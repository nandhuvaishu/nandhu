package List;

import java.util.Scanner;

public class Encryption {
public static void main( String [] args ) {
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
			String alphabet="abcdefghijklmnopqrstuvwxyz";
			String ALPHABET="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			char[] alpha="abcdefghijklmnopqrstuvwxyz".toCharArray();
			char[] ALPHA="ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
			char x1=input1.charAt(input1.length()-1);
			char x2=Character.toLowerCase(x1);
			int x3=alphabet.indexOf(x2)+1;
			//System.out.println(x3);
		        for(int i=0;i<input1.length()-1;i++){
		        	char ch=input1.charAt(i);
		        	if((ch>='a'&&ch<='z')||(ch>=1&&ch<=9)){
		        		//System.out.println(ch);
		        		//System.out.println(alphabet.indexOf(ch)+1);
		        	
		        	int ch1=(alphabet.indexOf(ch)+1)-x3;
		        	//System.out.println(ch1);
		        		if(ch1<=0){
		        			int ch2=ch1+26;
		        			char ch3=alpha[ch2-1];
		        			System.out.print(ch3);
		        		}else{
		        			char ch3=alpha[ch1-1];
		        			System.out.print(ch3);
		        		}
		        	
		        	}
		          // System.out.println(alphabet.indexOf(ch)+1);
		        	
		        	else {
		        		int ch1=(ALPHABET.indexOf(ch)+1)-x3;
			        	//System.out.println(ch1);
			        		if(ch1<=0){
			        			int ch2=ch1+26;
			        			char ch3=ALPHA[ch2-1];
			        			System.out.print(ch3);
			        		}else{
			        			char ch3=ALPHA[ch1-1];
			        			System.out.print(ch3);
			        		}
			        	
				           // System.out.println(ALPHABET.indexOf(ch)+1);}
		        	}
		        	
	        }System.out.print(x1);
		
		}}

	


