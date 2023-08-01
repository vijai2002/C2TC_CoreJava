package selflearning;

import java.util.Scanner;

public class LeftTriangleStarPattern {
	public void triangle(int n)
	{
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=(n-i);j>0;j--)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		LeftTriangleStarPattern sc=new LeftTriangleStarPattern();
		sc.triangle(n);
				

	}

}
