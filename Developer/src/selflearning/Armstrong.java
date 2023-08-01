package selflearning;

import java.util.Scanner;

public class Armstrong {
		public  void run(int n) {
			int temp=0,rem;
			int sum = 0;
			
			
			temp=n;
			String s=Integer.toString(n);
			int c=s.length();
			
			while(temp!=0)
			{
				rem=temp%10;
				sum+=Math.pow(rem,c);
				temp=temp/10;
			}
			if(sum==n)
			{
				System.out.println("Armstrong Number");
			}
			else
			{
				System.out.println("Not a Armstrong Number");
			}
		}
			public static void main(String[] args) {
				System.out.println("Enter the number to chech Armstrong or not:");                           
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				Armstrong a=new Armstrong();
				a.run(n);
				
		}
	
		
		

	

}
