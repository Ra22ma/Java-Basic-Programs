import java.util.Scanner;
class Sunnynumber1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		boolean isSunny=false;
		for(int i=1;i*i<=(num+1);i++)
		{
			if (i*i==(num+1))
			{
				isSunny=true;
				break;
			}
		}
		if(isSunny==true)
		{
			System.out.println("Sunny number");
		}
		else
		{
			System.out.println("Not a Sunny Number");
		}
	}
}
