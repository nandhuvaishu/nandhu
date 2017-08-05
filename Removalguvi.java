import java.util.Scanner;

public class Removalguvi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.next();int a=0;
for(int i=0;i<s.length();i++){a=0;
	for(int i1=0;i1<s.length();i1++){
		if(s.charAt(i)==s.charAt(i1))
			a=a+1;
		
}if(a==1){
	System.out.print(s.charAt(i));a=0;
}
	}

}}
