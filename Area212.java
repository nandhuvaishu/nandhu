package guvi;

import java.util.Scanner;

public class Area212 {
	
	public void circle(int r){
		double  circle=(22/7)*Math.pow(r, 2);
		System.out.println("area of circle"+" "+circle);
		}
	public void triangle(int l,int b){
	    int triangle=(l*b)/2;
        System.out.println("area of triangle"+" "+triangle);
        }
	public void rectangle(int l,int b){
		int rectangle=l*b;
    	System.out.println("area of rectangle"+" "+rectangle);
    	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int b=sc.nextInt();
		int l=sc.nextInt();
	Area212 a=new Area212();
	a.circle(r);
	a.triangle(l, b);	
	a.rectangle(l, b);
	}

}
