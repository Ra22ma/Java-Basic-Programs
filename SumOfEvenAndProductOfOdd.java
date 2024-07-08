import java.util.Scanner;
class SumOfEvenAndProductOfOdd
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		int product=1;
		while(num!=0)
		{
			int ld=num%10;
			if(ld%2==0)
			{
				sum=sum+ld;
			}
			else
			{
				product=product*ld;
			}
			num=num/10;
		}
		System.out.println(sum);
		System.out.println(product);

		

	}
}
