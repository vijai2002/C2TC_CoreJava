package Dayone1project;

public class Typecasting {
	int x=10;
	float f=x;
	double d=x;
	float t=10.5f;
	int y=(int) t;
	double b=t;
	double g=10.7;
	int q=(int) g;
	float e=(float) g;
	short s=(short) x;
	public static void main(String[] args) {
		Typecasting tp=new Typecasting();
		System.out.println(tp.x);
		System.out.println(tp.f);
		System.out.println(tp.d);
		System.out.println(tp.t);
		System.out.println(tp.y);
		System.out.println(tp.b);
		System.out.println(tp.g);
		System.out.println(tp.q);
		System.out.println(tp.e);
		System.out.println(tp.s); 
	}

}
