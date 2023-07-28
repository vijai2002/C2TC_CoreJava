package Daytwo2project;

public class Nestedifelse {

	public static void main(String[] args) {
		int speed=150;
		int mileage=60;
		if(speed>100)
		{
			if(mileage>50)
			{
				System.out.println("Your Bike is in Good Condition");
			}
			else
			{
				System.out.println("Your bike is not in good condition");
			}
		}
		else {
			System.out.println("Your Bike performance is bad!!");
		}

	}

}
