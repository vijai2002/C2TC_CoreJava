package statics;

public class Static {
static int id=10;
static {
	id=20;
	System.out.println("This is the static block");
	System.out.println("Static value can be changed in static block");
	System.out.println(id);
}
static void print() {
	int x=10;
	System.out.println(x);
}
Static(){
	id=30;
	System.out.println(id);
}




}
