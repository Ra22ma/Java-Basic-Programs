import java.util.Scanner;
class LearningAboutInbuiltMethods

{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a integer value:");
		int i=sc.nextInt();
		System.out.println("Enter a decimal value:");
		double j=sc.nextDouble();
		System.out.println("Enter a character value:");
		char ch=sc.next().charAt(0);
		System.out.println("Enter a string value:");
		String s=sc.next();
		System.out.println("Enter a boolen value:");
		boolean res=sc.nextBoolean();
		System.out.println(i);
		System.out.println(j);
		System.out.println(ch);
		System.out.println(s);
		System.out.println(res);
	}
		

	
}
