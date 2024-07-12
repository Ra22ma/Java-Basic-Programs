import java.util.Scanner;
class BouncyNumberPractice
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		boolean isIncreasing=true;
		boolean isDecreasing=false;
		int temp=num;
		int prev=temp%10;
		while(temp!=0)
		{
		   int ld = temp%10;
           if(ld > prev){
               isIncreasing=false;
               break;
           }
           prev= ld;
           temp/=10;
       }
       temp=num;
       prev= temp%10;
       while(temp!=0)
       {
           int ld = temp%10;
           if(ld < prev){
               isDecreasing=false;
               break;
           }
           prev= ld;
           temp/=10;
	   }
	   if(!isIncreasing && !isDecreasing)
		{
            System.out.println("Bouncy Number");
		}
        else
		{
            System.out.println("not a Bouncy Number");
        }

       
	}
}
