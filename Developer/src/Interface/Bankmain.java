package Interface;

public class Bankmain {

	public static void main(String[] args) {
		Person p=new Person();
		p.deposit(5000);
		p.withdraw(1500);
		System.out.println(p);
		}

}
