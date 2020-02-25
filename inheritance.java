//import java.util.scanner;

class admin
{
	private String name; private int reg; private String course;
	public admin(String n,int r,String co)
	{
		name=n;
		reg=r;
		course=co;
	}
	public String nam()
	{
		return name;
	}
	public int roll()
	{
		return reg;
	}
	public String cor()
	{
		return course;
	}
}
class mentor extends admin
{
	private double att; private double cgpa;
	public mentor(String n,int r,String co,double atte,double cg)
	{
		super(n,r,co);
        att=atte;
		cgpa=cg;
	}
	public double at()
	{
		return att;
	}
	public double cgp()
	{
		return cgpa;
	}
}
class inherit
{
	public static void main (String[] a)
	{
		mentor m=new mentor("ABC",1,"CS",88.5,9.2);
		System.out.println("Name:"+m.nam());
		System.out.println("Reg.no:"+m.roll());
		System.out.println("Course:"+m.cor());
		System.out.println("Attendance:"+m.at());
		System.out.println("CGPA:"+m.cgp());

	}
}