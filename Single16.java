package guvi;

public class Single16 {

	public static void main(String[] args) {
	int s[]={1,2,3,1,2,3,4};int count=0;
	for(int i=0;i<s.length;i++){
	
			boolean flag =true;count=0;
			
			for(int k=0;k<i;k++){
				if(s[i]==s[k]){
					flag=false;
				}
			}if(flag){
				for(int j=0;j<s.length;j++){
					if(s[j]==s[i])
						count=count+1;
						}
			}
		if(count==1){
			System.out.println(s[i]);}
		}
	
	}
	}
		
	
