public class Volume
{
private double volume;
public void vol_cube()
{
double side=4.5;
volume=side*side*side;
System.out.println("Volume Of Cube = "+volume+" cubic cm.");
}

public void vol_cuboid()
{
double l=10.5,b=7,h=12.75;
volume=l*b*h;
System.out.println("Volume Of Cuboid = "+volume+" cubic cm.");
}

public void vol_cylinder()
{
double pi=3.14,r=5.5,h=10;
volume=pi*r*r*h;
System.out.println("Volume of Cylinder="+volume+" cubic cm.");
}

public static void main(String Args[])
{
Volume v=new Volume();
v.vol_cube();
v.vol_cuboid();
v.vol_cylinder();
}
}