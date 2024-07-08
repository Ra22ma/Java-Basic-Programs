import java.util.Scanner;
class ProfitPercentage
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter selling price:");
		int sp=sc.nextInt();
		System.out.println("Enter cost price:");
		int cp=sc.nextInt();
		double res=sp-cp/cp*100;
		{
			System.out.println(res);
		}

	}
}
