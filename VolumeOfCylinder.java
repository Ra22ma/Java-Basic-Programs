import java.util.Scanner;
class VolumeOfCylinder
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter pie value:");
		double pi=sc.nextDouble();
		System.out.println("Enter radius:");
		int r=sc.nextInt();
		System.out.println("Enter height:");
		int h=sc.nextInt();
		double res=pi*r*r*h;
		{
			System.out.println(res);
		}
	}
}
