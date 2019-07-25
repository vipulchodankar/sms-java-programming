public class Si
{
public double si_cal(double p,double t,double r)
{
double si=p*t*r/100;
return si;
}

public static void main(String Args[])
{
Si in=new Si();
double si=in.si_cal(20000.50,4,8);
System.out.println("Simple Interest = "+si);
}
}