package com.cg.dyone;

import java.util.Scanner;

public class Add {

	
		
		public static void add(int a,int b)
		{
		
			
			int c=a+b;
			System.out.println(c);
		}
		public static void sub(int a,int b)
		{
		
			
			int c=a-b;
			System.out.println(c);
		}
		public static void mul(int a,int b)
		{
		
			
			int c=a*b;
			System.out.println(c);
		}
		public static void div(int a,int b)
		{
		
			
			int c=a/b;
			System.out.println(c);
		}
		
		public static void main(String[] args) 
		{
			int a,b;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value of a:");
			a=sc.nextInt();
			System.out.println("Enter the value of b:");
			b=sc.nextInt();
			Add.add(a,b);
			Add.sub(a,b);
			Add.mul(a,b);
			Add.div(a,b);
					

	}

}
