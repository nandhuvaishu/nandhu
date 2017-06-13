import java.util.Scanner;

public class Lcmguvi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, minMultiple;
		Scanner ss=new Scanner(System.in);
	    System.out.println("Enter two positive integers: ");
	    n1=ss.nextInt();
	    n2=ss.nextInt();

	    // maximum number between n1 and n2 is stored in minMultiple
	    minMultiple = (n1>n2) ? n1 : n2;

	    // Always true
	    
	    
	        if( minMultiple%n1==0 && minMultiple%n2==0 )
	        
	           System.out.println("The LCM of %d and %d is %d."+ n1 +" "+n2+" "+minMultiple);
	            
	        
	        ++minMultiple;
	   
	}

}
