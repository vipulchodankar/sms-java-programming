class Water
{private String name;
private double bill,rate,unit,sewg;
void get(String n,double u,double r)
{name=n;
unit=u;
rate=r;}
void cal()
{sewg=0.4*(unit*rate);
bill=(unit*rate)+sewg;}
void display()
{System.out.println("Customer Name is "+name);
System.out.println("Units Consumed = "+unit+"L");
System.out.println("Sewage Charges = Rs."+sewg);
System.out.println("Rate per L = Rs."+rate);
System.out.println("Total Bill = Rs."+bill);}
public static void main(String Args[])
{Water w=new Water();
String na="Vipul C.";
w.get(na,50,5);
w.cal();
w.display();}}