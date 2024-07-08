import java.util.Scanner;
class FinalBillAfterDiscount
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your bill:");
		int bill=sc.nextInt();
		if(bill>5000)
		{
			System.out.println("You get a discount of 20%");
			System.out.println("Your final bill is:"+((80*bill)/100));
		}
		else
		{
			System.out.println("You get a discount of 10%");
			System.out.println("Your final bill is:"+((90*bill)/100));
		}
		System.out.println("ThankYou");
	}
}
