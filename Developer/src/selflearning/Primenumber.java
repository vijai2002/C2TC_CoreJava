package selflearning;

public class Primenumber {

	public static void main(String[] args) {
		int m,i,flag=0;
		int n=7;
		m=n/2;
		if(n==0||n==1)
		{
			System.out.println("Not a prime number");
		}
		else
		{
			for(i=2;i<=m;i++)
			{
				if(n%i==0)
				{
					System.out.println("Not a prime number");
					flag=1;
					break;
				}
			}
		
				
					if(flag==0)
					{
						System.out.println("Prime number");
					}
				
			
		}

	}

}
