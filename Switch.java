import java.util.Scanner;
class Switch
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:System.out.println("Hello");
			case 2:System.out.println("Hi");
			case 3:System.out.println("Number");
			case 4:System.out.println("Coffe");
			case 5:System.out.println("Movie");
			case 6:System.out.println("Blocked");
			
			default:System.out.println("Enter a valid input");
			break;
		}
	}
}
