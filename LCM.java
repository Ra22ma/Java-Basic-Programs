import java.util.Scanner;
class LCM
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int i=1;
		
		while(true)
		{
			if((n1*i)%n2==0)
			{
			 System.out.println(n1*i);
			 break;
			}
			i++;
		
		}
		
	}
}
