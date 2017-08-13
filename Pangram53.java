package guvi;

import java.util.Scanner;

public class Pangram53 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		int a1=1,b1=1,c1=1,d1=1,e1=1,f1=1,g1=1,h1=1,i1=1,j1=1,k1=1,l1=1,m1=1,n1=1,o1=1,p1=1,q1=1,r1=1,s1=1,t1=1,u1=1,v1=1,w1=1,x1=1,y1=1,z1=1;
		for(int i=0;i<a.length();i++){
			char s11=a.charAt(i);
			switch(s11){

			case 'a':
				a1=2;break;
			case 'b':
				b1=2;break;
			case 'c':
				c1=2;break;
			case 'd':
				d1=2;break;
			case 'e':
				e1=2;break;
			case 'f':
				f1=2;break;
			case 'g':
				g1=2;break;
			case 'h':
				h1=2;break;
			case 'i':
				i1=2;break;
			case 'j':
				j1=2;break;
			case 'k':
				k1=2;break;
			case 'l':
				l1=2;break;
			case 'n':
				n1=2;break;
			case 'm':
				m1=2;break;
			case 'o':
				o1=2;break;
			case 'p':
				p1=2;break;
			case 'q':
				q1=2;break;
			case 'r':
				r1=2;break;
			case 's':
				s1=2;break;
			case 't':
				t1=2;break;
			case 'u':
				u1=2;break;
			case 'v':
				v1=2;break;
			case 'w':
				w1=2;break;
			case 'x':
				x1=2;break;
			case 'y':
				y1=2;break;
			case 'z':
				z1=2;break;
			}
		}
	if(a1==2&&b1==2&&c1==2&&d1==2&&e1==2&&f1==2&&g1==2&&h1==2&&i1==2&&j1==2&&k1==2&&l1==2&&m1==2&&n1==2&&o1==2&&p1==2&&q1==2&&r1==2&&s1==2&&t1==2&&u1==2&&v1==2&&w1==2&&x1==2&&y1==2&&z1==2){
		
	System.out.println("the given sentence is pangram");
	
	}else{	System.out.println("the given sentence is not a pangram");
	}
	}
}
