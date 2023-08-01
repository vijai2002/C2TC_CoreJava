package Nestinterface;

public class Interface3 implements Interface1,Interface1.Interface2{
	@Override
	public void run()
	{
		System.out.println("I am Running");
	}
	@Override
	public void walk()
	{
		System.out.println("I am Walking");
	}
}
