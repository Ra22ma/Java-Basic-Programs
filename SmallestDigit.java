import java.util.Scanner;
class SmallestDigit

{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int smallest=9;
		while(num!=0)
		{
			int ld=num%10;
			if(ld<smallest)
			{
				smallest=ld;
			}
			num=num/10;
		}
		System.out.println(smallest);
	}
}
