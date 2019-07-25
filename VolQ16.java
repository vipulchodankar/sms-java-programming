public class VolQ16
{
private double volume;

public void cal_vol(double side)
{
volume=Math.pow(side,3);
System.out.println("Volume Of Cube = "+volume);
}

public void cal_vol(double r,double h)
{
volume=3.14*r*r*h;
System.out.println("Volume Of Cylinder = "+volume);
}

public void cal_vol(double l,double b,double h)
{
volume=l*b*h;
System.out.println("Volume of Rectangle = "+volume);
}

public static void main(String Args[])
{
VolQ16 volu=new VolQ16();
volu.cal_vol(25);
volu.cal_vol(56,85);
volu.cal_vol(55.3,78.1,54.5);
}
}