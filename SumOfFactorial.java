import java.util.Scanner;
class SumOfFactorial
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int  num=sc.nextInt();
		int sum=0;
		while(num!=0)
		{
			int ld=num%10;
			int product=1;
			for(int i=1;i<=ld;i++)
				{
					product=product*i;
				}
				sum=sum+product;
				num=num/10;
			}
			System.out.println(sum);
		
	}
}
