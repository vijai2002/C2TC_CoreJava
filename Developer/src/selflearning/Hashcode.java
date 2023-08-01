package selflearning;

public class Hashcode {
	private int regno;
	private String name;
	
	public Hashcode(int regno, String name) {
		super();
		this.regno = regno;
		this.name = name;
	}
	

	public int getRegno() {
		return regno;
	}


	public void setRegno(int regno) {
		this.regno = regno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	

	@Override
	public String toString() {
		return "Hashcode [regno=" + regno + ", name=" + name + "]";
	}


	public static void main(String[] args) {
		
		Hashcode e=new Hashcode(1,"vijai");
		Hashcode e1=new Hashcode(2,"vj");
		int a=e.hashCode();
		int b=e1.hashCode();
		System.out.println("The Value of A:"+a);
		System.out.println("The Value of B:"+b);
		System.out.println("The Value of Equality:"+e.equals(e1));
		
		
		

	}

}
