import java.util.Scanner;
class Palindromes1To100
{
	public static void main(String[] args) 
	{
	
		for(int num=1;num<=100;num++)
		{
		int temp=num;
		int rev=0;
		while(temp!=0)
		{
			
			
			int ld=temp%10;
			rev=rev*10+ld;
			temp=temp/10;
			
			
		
		}
		if(rev==num)
		{
			System.out.println(num);
		}
		}
		
	}
}
