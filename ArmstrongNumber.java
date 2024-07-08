import java.util.Scanner;
class ArmstrongNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int count=0;
		while(temp!=0)
		{
			count++;
			temp=temp/10;
		}
		
		int sum=0;
		while(temp!=0)
		{
			int ld=num%10;
			int product=1;
			for(int i=1;i<=count;i++)
			{
				product=product*ld;
			}
			sum=sum+product;
			temp=temp/10;
		}
		if(sum==num)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not a Armstrong Number");
		}
	} 
}
