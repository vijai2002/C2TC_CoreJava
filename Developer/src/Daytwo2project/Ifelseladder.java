package Daytwo2project;

public class Ifelseladder {

	public static void main(String[] args) {
		int mark=79;
		if(mark>90)
		{
			System.out.println("Grade A");
		}
		else if(mark>80 &&mark<90)
		{
			System.out.println("GradeB");
		}
		else if(mark>70 && mark<80)
		{
			System.out.println("GradeC");
		}
		else if(mark>60 &&mark<70)
		{
			System.out.println("GradeD");
		}
		else
		{
			System.out.println("Fail");
		}

	}

}
