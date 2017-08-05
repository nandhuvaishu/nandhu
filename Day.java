package guvi;

import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();int a=0;
		switch(s){
		case "sunday":
			System.out.println("false");break;
		case "monday":
			System.out.println("true");break;
		case "tuesday":
			System.out.println("true");break;
		case "wednesday":
			System.out.println("true");break;
		case "thursday":
			System.out.println("true");break;
		case "friday":
			System.out.println("true");break;
		case "saturday":
			System.out.println("true");break;
		}
	}

}
