package hierarical;


public class Child extends Grand {
	void age2()
	{
		System.out.println("My Age is 16");
	}
	Child()
	{
		System.out.println("I am the youngest person in the family");
	}

	public static void main(String[] args) {
		Child c=new Child();
		c.age();
		//c.age1();
		c.age2();
}}
