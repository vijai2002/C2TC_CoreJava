package selflearning;

import java.util.Scanner;

public class Pyramidstarpattern {
	public void triangle(int n)
	{
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=n-i;j>1;j--)
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
		Pyramidstarpattern m=new Pyramidstarpattern();
		m.triangle(n);
		
		

	}

}
