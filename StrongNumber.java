import java.util.Scanner;
class StrongNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=0;
		int sum=0;
		while(temp!=0)
		{
			int ld=temp%10;
			int product=1;
			for(int i=1;i<=temp;i++)
			{
				product=product*ld;
			}
			sum=sum+product;
			temp=temp/10;
		}
		if(temp==num)
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not a strong number");
		}

	}
}
