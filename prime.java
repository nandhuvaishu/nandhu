import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		int a3=1,count=0,t=0;
		for(int i=a1;i<=a2;i++)
		{
			for(int j=2;j<=i/2;j++)
			{
				if((i%j)==0)
				{
					count++;
				}
				else
					count=0;
			}
				if(count==0)
			{
					//temp=i%10;
					//temp1=i/10;
					if((i%10)==a3)
						t++;
					if((i/10)==a3)
						t++;
			}
			
		}
		System.out.println(t);
	}
}

