import java.util.Scanner;
class SimpleIntrest
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principle amount:");
		int p=sc.nextInt();
		System.out.println("Enter rate of intrest:");
		int r=sc.nextInt();
		System.out.println("Enter time:");
		int t=sc.nextInt();
		
		{
			double res=p*t*r/100;
			System.out.println(res);
		}
	}
}
