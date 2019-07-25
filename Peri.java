public class Peri
{
private double pmtr;

public void cal(double s)
{
pmtr=s*4;
System.out.println("Perimeter of Square = "+pmtr+"cm.");
}

public void cal(double l,double b)
{
pmtr=2*(l+b);
System.out.println("Perimeter of Rectangle = "+pmtr+"cm.");
}

public void cal(double a,double b,double c)
{
pmtr=a+b+c;
System.out.println("Perimeter of a Triangle = "+pmtr+"cm.");
}

public static void main(String Args[])
{
Peri p=new Peri();
p.cal(21);
p.cal(14,11);
p.cal(10,12,9);
}
}