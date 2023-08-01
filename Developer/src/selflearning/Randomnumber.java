package selflearning;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Randomnumber {

	public static void main(String[] args) {
		double x=Math.random();
		System.out.println(x);
		int min=100;
		int max=200;
		double z=Math.random()*(max-min+1)+min;
		System.out.println(z);
		Random random=new Random();
		int y=random.nextInt(40);
		System.out.println(y);
		int f=(int) random.nextFloat(30);
		System.out.println(f);
		int a=ThreadLocalRandom.current().nextInt();
		System.out.println(a);
		
	}

}
