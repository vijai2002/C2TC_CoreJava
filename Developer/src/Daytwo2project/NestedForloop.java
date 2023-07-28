package Daytwo2project;

public class NestedForloop {

	public static void main(String[] args) {
		int x=5,i,j;
		for(i=1;i<=x;i++)
		{
			for(j=1;j<=x;j++)
			{
				if(i==1||i==x||j==1||j==x)
				{
					System.out.print("*");
					
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println(" ");
		}
	}

}
