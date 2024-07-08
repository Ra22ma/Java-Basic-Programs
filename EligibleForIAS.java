import java.util.Scanner;
class EligibleForIAS
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		if(age>=21&&age<=32)
		{
			System.out.println("Eligible for writting IAS exam:");
		}
		else
		{
			System.out.println("Not Eligible for IAS exam:");
		}
	}
}
