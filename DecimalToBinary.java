import java.util.Scanner;
class DecimalToBinary
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int base=1;
		int result=0;
		while(num!=0)
		{
			int rem=num%2;
			result=result+(rem*base);
			base=base*10;
			num=num/2;
		}
		System.out.println(result);
	}
}
