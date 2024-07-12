import java.util.Scanner;
class BinaryToDecimal
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int base=1;
		int res=0;
		while(num!=0)
		{
			int rem=num%10;
			res=res+(rem*base);
			base=base*2;
			num=num/10;
		}
		System.out.println(res);
	}
}
