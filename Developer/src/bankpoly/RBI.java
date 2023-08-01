package bankpoly;

public class RBI {
	void interest()
	{
		System.out.println("The Interest is 15%");
	}
	}

   class SBI extends RBI
	{
		void  interest()
		{
			System.out.println("The Interest is 20%");
		}
	}
	 class INDIAN extends RBI
	{
		void interest()
		{
			System.out.println("The Interest is 30%");
		}
	}
	 class HDFC extends RBI{
		void interest()
		{
			System.out.println("The interest is 20%");
		}
	 }


	

