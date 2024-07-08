import java.util.Scanner;
class XyleomOrPhloem
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum1=num%10;
		num=num/10;
		int sum2=0;
		while(num>9)
		{
			int ld=num%10;
			sum2=sum2+ld;
			num=num/10;
		}
		sum1=sum1+num;
		if(sum1==sum2)
		{
			System.out.println("Xyleom Number");
		}
		else
		{
			System.out.println("Phloem Number");
		}
	}
}
