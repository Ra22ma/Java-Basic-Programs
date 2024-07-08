import java.util.Scanner;
class UniqueNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int num1=number;
		int num2=number;
		int count=0;
		while(num1>0)
		{
			int ld1=num1%10;
			while(num2>0)
			{
			int ld2=num2%10;
			if(ld1==ld2)
				{
				count++;
				}
				num2=num2/10;
			}
			num1=num1/10;
		}
		if(count==1)
		{
			System.out.println("Unique number");
		}
		else
		{
			System.out.println("Not unique number");
		}



	}
}
