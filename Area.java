public class  Area
{
private double area;

public void cal_area(double side)
{
area =side*side;
System.out.println("Area of sq = "+area);
}

public void cal_area(double l,double b)
{
area = l*b;
System.out.println("Area of rect. = "+area);
}

public void cal_area(double a,double b,double c)
{
double s=(a+b+c)/2;
area =Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("Area of Tri ="+area);
}

public static void main (String Args[])
{
Area a=new Area();
a.cal_area(80);
a.cal_area(54,84);
a.cal_area(45,23,59);
}
}