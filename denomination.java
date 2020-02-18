import java.util.Scanner;
class Denom
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n2000,n500,n200,n100,n50,n20,n10,n5,n2,n1;
		n2000=n500=n200=n100=n50=n20=n10=n5=n2=n1=0;
		System.out.println("Enter amount");
		int amt=sc.nextInt();
		if(amt>=2000)
		{
			n2000=amt/2000;
			amt=amt-(2000*n2000);
		}
		if(amt>=500)
		{
			n500=amt/500;
			amt=amt-(500*n500);
		}
		if(amt>=200)
		{
			n200=amt/200;
			amt=amt-(200*n200);
		}
		if(amt>=100)
		{
			n100=amt/100;
			amt=amt-(100*n100);
		}
		if(amt>=50)
		{
			n50=amt/50;
			amt=amt-(50*n50);
		}
		if(amt>=20)
		{
			n20=amt/20;
			amt=amt-(20*n20);
		}
		if(amt>=10)
		{
			n10=amt/10;
			amt=amt-(10*n10);
		}
		if(amt>=5)
		{
			n5=amt/5;
			amt=amt-(5*n5);
		}
		if(amt>=2)
		{
			n2=amt/2;
			amt=amt-(2*n2);
		}
		if(amt>=1)
		{
			n1=amt;
		}
		System.out.println("Denominations are");
		System.out.println("2000="+n2000);
		System.out.println("500="+n500);
		System.out.println("200="+n200);
		System.out.println("100="+n100);
		System.out.println("50="+n50);
		System.out.println("20="+n20);
		System.out.println("10="+n10);
		System.out.println("5="+n5);
		System.out.println("2="+n2);
		System.out.println("1="+n1);
	}

}