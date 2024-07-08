import java.util.Scanner;
class SpyNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		int pro=1;
		while(num!=0)
		{
			int ld=num%10;
			sum=sum+ld;
			pro=pro*ld;
			num=num/10;
		}
		if(pro==sum)
		{
			System.out.println("Spy Number");
		}
		else
		{
			System.out.println("Not a spy number");
		}

	}
}
