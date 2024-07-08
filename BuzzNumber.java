import java.util.Scanner;
class BuzzNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int ld=num%10;
		if((ld==7)||(num%7==0))
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}


	}
}
