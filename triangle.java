import java.util.Scanner;
class tri
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sides of triangle");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a==b && b==c)
		{
			System.out.println("Equilateral");
		}
		else if(a==b || b==c ||a==c)
		{
			System.out.println("Isosceles");
		}
		else
		{
			System.out.println("Scalene");
		}
	}

}