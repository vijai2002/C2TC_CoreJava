package Daythree3project;

public class Constructor {
	Constructor()
	{
		System.out.println("This is the default constructor");
	}
	int x;
	int y;
	Constructor(int x,int y)
	{
		int z=x+y;
		System.out.println(z);
		System.out.println("This is the example of parameterized constructor");
	}
	public static void main(String[] args)
	{
		Constructor c=new Constructor(10,20);
		Constructor cs =new Constructor();
		
	}
	

}
