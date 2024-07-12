import java.util.Scanner;
class FirstNPrimeNumbers
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sln=1;
		for(int num=1;sln<=n;num++)
		{
			int count=0;
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
				}
			}
			if(count==2)
				{
				if(sln==n)
					{
				System.out.println(sln+")"+num);
					}
				sln++;
			}
				
		}
	}
}
