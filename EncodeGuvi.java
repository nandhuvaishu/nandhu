import java.util.Scanner;

public class EncodeGuvi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String input1=sc.next();
String input2=sc.next();
char c=input2.charAt(0);
String al="abcdefghijklmnopqrstuvwxyz";
char alp[]="abcdefghijklmnopqrstuvwxyz".toCharArray();
int c1=al.indexOf(c);
//System.out.println(c1);
int b1;
char b;char s1;
for(int i=0;i<input1.length();i++){
b=input1.charAt(i);
b1=al.indexOf(b)+c1;
//System.out.println(b1);
if(b1>=26){
	int v=b1-26;
	s1=alp[v];
}else{
	s1=alp[b1];
}

System.out.print(s1);

}System.out.print(" "+alp[c1]);
for(int j=1;j<input2.length()-1;j++){
	b=input2.charAt(j);
	b1=al.indexOf(b)+c1;
	//System.out.println(b1);
	if(b1>=26){
		int v=b1-26;
		s1=alp[v];
	}else{
		s1=alp[b1];
	}

	System.out.print(s1);
	
	}char k=input2.charAt(input2.length()-1);
	int cc=al.indexOf(k);
	char s=alp[cc];
	System.out.print(s);

	}

}
