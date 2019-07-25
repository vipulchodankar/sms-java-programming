public class Marks
{
private String name="Vipul";
private double phy=95,bio=94,chem=97,avg;

public void cal_avg()
{
avg=(phy+bio+chem)/3;
System.out.println("Average of "+name+" = "+avg);
}

public static void main(String Args[])
{
Marks ma=new Marks();
ma.cal_avg();
}
}