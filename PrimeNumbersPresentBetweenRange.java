import java.util.Scanner;
class PrimeNumbersPresentBetweenRange1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int res=0;
		for(int i=n1;i<n2;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					res=1;
				}
			}
			if(res==0)
			System.out.println(i);
		}

	}
}
