package guvi;
import java.util.StringTokenizer;
import java.util.Scanner;

public class Spsace92 {



	
	    public static void main(String a[]){
	        String str = "this    is     a wrong   sentence";
	        StringTokenizer st = new StringTokenizer(str, " ");
	       // System.out.println(st);
	        StringBuffer sb = new StringBuffer();
	        while(st.hasMoreElements()){
	            sb.append(st.nextElement()).append(" ");
	        }
	        System.out.println(sb.toString());
	    }
	}


