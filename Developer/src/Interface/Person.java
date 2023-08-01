package Interface;



	public class Person implements Bank{
		float currentbal=6000.f;
		public void deposit(int amount)
		{
			currentbal+=amount;
			System.out.println("The current Bal is:"+currentbal);
		}
		public void withdraw(int amount)
		{
			if(amount>currentbal-Minbalance)
			{
				System.out.println("Unable to withdraw the amount"+amount);
			}
			else
			{
				currentbal-=amount;
				System.out.println("The withdraw amount is:"+amount);
				System.out.println("The Current Balance After Withdrw:"+currentbal);
			}
		}
		@Override
		public String toString() {
			return "Person [currentbal=" + currentbal + "]";
		}
		
		
		
		
	}

