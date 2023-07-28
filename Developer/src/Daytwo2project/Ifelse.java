package Daytwo2project;

public class Ifelse {

	public static void main(String[] args) {
		int num=10;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
				System.out.println("These numbers are completely divided by 10");
				System.out.println(" ");
			}
			else
			{
				System.out.println("These numbers are not completely divided by 10");
				System.out.println(" ");
			}
		}
		

	}

}
