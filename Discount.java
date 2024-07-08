import java.util.Scanner;
class Discount
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marked price of an article:");
		int mp=sc.nextInt();
		System.out.println("Enter discount:");
		int dis=sc.nextInt();
		double res=100-dis/100*mp;
		{
			System.out.println(res);
		}
	}
}
