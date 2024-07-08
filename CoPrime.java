import java.util.Scanner;
class CoPrime
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int divisor=sc.nextInt();
		int divident=sc.nextInt();
		while(divisor!=0)
		{
			int rem=divident%divisor;
			divident=divisor;
			divisor=rem;
		}
		if(divident==1)
		{
			System.out.println("CoPrime");
		}
		else
		{
			System.out.println("Not a CoPrime");
		}
		

	}
}
