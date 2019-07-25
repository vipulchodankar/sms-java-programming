public class Cricketer
{
private String name="Vipul Chodankar",nation="India";
private int run1=98,run2=103,age=20;

public void cal_total()
{
double truns=run1+run2;
System.out.println("Total runs = "+truns);
}

public void display()
{
System.out.println("Player Name = "+name);
System.out.println("Country = "+nation);
System.out.println("Age = "+age);
System.out.println("Runs scored in match 1 = "+run1);
System.out.println("Runs scored in match 2 = "+run2);
}

public static void main(String Args[])
{
Cricketer plyr=new Cricketer();
plyr.cal_total();
plyr.display();
}
}