public class Employee
{
private double basicpay,da,hra,pf,gross,net;

	public void get_basic(double bp)
	{
	basicpay=bp;
	}

	public void calculate()
	{
	da=0.50*basicpay;
	hra=0.20*(basicpay+da);
	pf=0.12*(basicpay+da);
	gross=basicpay+da+hra;
	net=gross-pf;
	}

	public void display()
	{
	System.out.println("Basic Pay = Rs."+basicpay);
	System.out.println("DA = Rs."+da);
	System.out.println("HRA = Rs."+hra);
	System.out.println("PF = Rs."+pf);
	System.out.println("Gross Salary = Rs."+gross);
	System.out.println("Net Salary = Rs."+net);
	}

	public static void main(String Args[])
	{
	Employee e=new Employee();
	e.get_basic(50000);
	e.calculate();
	e.display();
}
}