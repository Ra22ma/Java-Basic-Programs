import java.util.Scanner;
class MultiplicationTable
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		System.out.println("Enter the range:");
		int range=sc.nextInt();
		for(int i=1;i<=range;i++)
		{
	
			int res=num*i;

		System.out.println(num+"*"+i+"="+res);
		}

	}
}
