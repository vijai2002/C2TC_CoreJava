package selflearning;

public class Palindrome {

	public static void main(String[] args) {
	int n=121;
	int r=0,temp,sum=0;
	temp=n;
	while(n>0)
	{
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
	}
	if(temp==sum)
	{
		System.out.println("The Number is palindrome");
	}
	else
	{
		System.out.println("The number is not palindrome");
	}
	
	
		
		
	}

}
