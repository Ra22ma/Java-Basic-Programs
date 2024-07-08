import java.util.Scanner;
class NumbersFrom1To10
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		for(int i=n1;n1<=n2;i++)
		{
			System.out.println(i);
		}
	}
}
