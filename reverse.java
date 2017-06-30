package Assignment2;
import java.io.*;
public class reverse {

	public static void main(String[] args) {
		int number=Integer.parseInt(args[0]);
		int number1=number;
		int temp=0,reverse=0;
		while(number!=0){
			temp=number%10;
			number=number/10;
			reverse=(reverse*10)+temp;
		}
			System.out.println(number1+"->"+reverse);
	}

}
