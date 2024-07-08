import java.util.Scanner;
class LargestDigit
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int largest=0;
		while(num!=0)
		{
			int ld=num%10;
			if(ld>largest)
			{
				largest=ld;
			}
			num=num/10;
		}
		System.out.println(largest);
		
	}
}
