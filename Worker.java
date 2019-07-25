public class Worker
{
private double wno,hwk,wrate,twage;

public Worker(double wo,double hk,double we)
{
	wno=wo;
	hwk=hk;
	wrate=we;
}

public Worker()
wno=1;
hwk=1;
wrate=50;
}

public void calc()
{

	twage=hwk*wrate;
display();
}

public void display()
{
System.out,println("Total Wage = "+twage);
}

public static void main(String Args[])
{
	Worker ob=new Worker(33,4,9564);
	Worker ob1=new Worker();
}
}