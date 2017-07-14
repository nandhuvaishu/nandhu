import java.util.Scanner;

public class Least {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String input=sc.next();
char input1[]=input.toCharArray();
char temp;
//int input1=Integer.parseInt(input);
for(int i=0;i<input1.length;i++){
	for(int j=i+1;j<input1.length;j++){
		if(input1[i]>input1[(j)]){
		 temp=input1[i];
			input1[i]=input1[j];
			input1[j]=temp;
			
		}
	}}System.out.println(input1[0]+""+input1[1]);


	}

}
