class	progress

{

private double w1,w2,w3,w4,w5,w6,avg;

public progress()
{
w1=3;
w2=3.5;
w3=4;
w4=4.5;
w5=5;
w6=6;
}

public progress(double ww1,double ww2,double ww3,double ww4,double ww5,double ww6)
{
w1=ww1;
w2=ww2;
w3=ww3;
w4=ww4;
w5=ww5;
w6=ww6;
}
public void cal_avg(progress p2)
{
double t1=w1+w2+w3+w4+w5+w6;
double t2=p2.w1+p2.w2+p2.w3+p2.w4+p2.w5+p2.w6;
avg=(t1+t2)/12;
display();
}

public void display()
{
System.out.println("Average is "+avg);
}


public static void main(String Args[])
{
progress p1=new progress();
progress p2=new progress(6.5,7,7.5,8,8.5,9);
p1.cal_avg(p2);
}
}