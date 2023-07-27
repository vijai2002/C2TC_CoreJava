package com.cg.dyone;


public class Constructor {

	//Constructor
	Constructor()
	{
		System.out.println("Hello! This is constructor");
	}
	//Normal method
	void C()
	{
		System.out.println("This is normal method");
	}
	public static void main(String[] args)
	{
		Constructor cs=new Constructor ();
		cs.C();
		
	}
}
