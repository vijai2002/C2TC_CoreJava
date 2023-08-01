package bankpoly;

public class Rbimain {

	public static void main(String[] args) {
		
		RBI r;
		SBI s;
		INDIAN i;
		HDFC h;
		
		r = new HDFC();//upcasting...
		r.interest();
		r=new SBI();
		r.interest();
//		s= new RBI();
//		s.interest();// It does not work
		

	}

}
