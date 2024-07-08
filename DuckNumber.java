import java.util.Scanner;
class DuckNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		boolean digitpresent=false;
		while(num!=0)
		{
			int ld=num%10;
			if(ld==0)
			{
				digitpresent=true;
				break;
			}
		num=num/10;
		}
		if(digitpresent==true)
		{
			System.out.println("Duck Number");
		}
		else
		{
			System.out.println("Not a Duck Number");
		}
	}
}
