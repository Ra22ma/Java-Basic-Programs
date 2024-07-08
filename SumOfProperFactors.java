import java.util.Scanner;
class PerfectNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
	if(sum==num)
	{
		System.out.println("perfect Number");
	}
	else
	{
		System.out.println("Not a perfect Number");
	}
	}
}
