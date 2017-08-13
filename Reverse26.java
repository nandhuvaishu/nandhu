package guvi;

public class Reverse26 {


		  public int reverseNumber(int number){
		         
		        int reverse = 0;
		        while(number != 0){
		            reverse = (reverse*10)+(number%10);
		            number = number/10;
		        } 
		        return reverse;
		    }
		     
		    public static void main(String a[]){
		        Reverse26 nr = new Reverse26();
		        System.out.println("Result: "+nr.reverseNumber(342242));
		    }
		

	}


