package guvi;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		  int f1[]=new int[]{1,1,2,2,11};
		    for(int i=0;i<5;i++){
			 boolean flag=true;count=0;
		 
			 for(int i1=0;i1<i;i1++){
				 if(f1[i]==f1[i1]){
					 flag=false;
				 } }
			 if(flag){
				 for(int j=0;j<5;j++){
					 if(f1[i]==f1[j]){
						 count=count+1;
						 }
					 }
				 }
			 if(count==1){System.out.println(f1[i]);
	
			 }

			 }
		 }
	}


