package selflearning;

import java.util.Scanner;

public class Rectanglestar {
	public void triangle(int n)
	{
		int i,j;
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=n;j++)
			{
				if(i==0||i==n||j==0||j==n)
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

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Rectanglestar r=new Rectanglestar();
		r.triangle(n);

	}

}
