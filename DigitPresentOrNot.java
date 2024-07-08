import java.util.Scanner;
class DigitPresentOrNot
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int digit=sc.nextInt();
		boolean digitpresent=false;
		while(n!=0)
		{
			int ld=n%10;
			if(ld==digit)
			{
				digitpresent=true;
				break;
			}
			n=n/10;
		}
		if(digitpresent==true)
		{
			System.out.println("digit present in the given number");
		}
		else
		{
			System.out.println("digit not present in the given number");
		}

	}
}
