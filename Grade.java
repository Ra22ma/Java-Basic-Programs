import java.util.Scanner;
class Grade
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your grade:");
		char grade=sc.next().charAt(0);
		if(grade=='A')
		{
			System.out.println("You got first rank");
		}
		else if(grade=='B')
		{
			System.out.println("You got second rank");
		}
		else if(grade=='c')
		{
			System.out.println("you got first class");
		}
		else if(grade=='D')
		{
		System.out.println("You got second class");
		}
		else if(grade=='E')
		{
			System.out.println("Your just passed");
		}
		else if(grade=='F')
		{
			System.out.println("fail");
		}
		else
		{
			System.out.println("Please enter a valid input");
		}

	}
}
