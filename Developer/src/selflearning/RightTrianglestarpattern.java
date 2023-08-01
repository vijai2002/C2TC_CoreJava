package selflearning;

import java.util.Scanner;

public class RightTrianglestarpattern {
	public void triangle(int n)
	{
		int i,j;
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
				
			}
			System.out.println(" ");
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Enter the Number:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		RightTrianglestarpattern a=new RightTrianglestarpattern();
		a.triangle(n);
		
		

	}

}
