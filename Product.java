import java.util.Scanner;
class Product
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int pro=1;
		for(int i=1;i<=n;i++){
			pro=pro*i;
		}
		System.out.println(pro);
	
	}
}
