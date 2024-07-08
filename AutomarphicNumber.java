import java.util.Scanner;
class AutomarphicNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		int square=num*num;
		while(num!=0)
		{
			if((num%10)!=(square%10))
			{
				count++;
				break;
			}
			num=num/10;
			square=square/10;
		}
		if(count>0)
		{
			System.out.println("Not an Automarphic Number");
		}
		else
		{
			System.out.println("Automarphic");
		}
	}
}
