import java.util.Scanner;
class TechNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		int temp=num;
		int fh=0;
		int sh=0;
		while(temp!=0)
		{
			count++;
			temp=temp/10;
		}
		if(count%2!=0)
		{
			System.out.println("The number can't be split");
		}
		else
		{
			int div=1;
			for(int i=1;i<=count/2;i++)
			{
				div=div*10;
			}
			fh=num/div;
			sh=num%div;
		}
		int res=fh+sh;
		int res1=res*res;
		if(res1==num)
		{
			System.out.println("Tech Number");
		}
		else
		{
			System.out.println("Not a Tech Number");
		}
	}
}
