class Time
{
int hrs,min;


void input(int h,int m)
{
	hrs=h;
	min=m;
}


Time addtime(Time obj2)
{
	Time t3=new Time();
	t3.hrs=hrs+obj2.hrs;
	t3.min=min+obj2.min;
	if(t3.min>=60)
		{
		t3.hrs=output.hrs+1;
		t3.min=output.min-60;
		}
	System.out.println("Hours :"+t3.hrs+" & Mins : "+t3.min);
	return t3;
}


void display(Time obj2,Time obj3)
{

  System.out.println("T1 Hours :"+hrs+" mins :"+min);
  System.out.println("T2 Hours :"+obj2.hrs+" mins :"+obj2.min);
  System.out.println(t3)
}


public static void main(String Args[])
{
		Time t1=new Time();
		Time t2=new Time();

		t1.input(1,50);
		t2.input(3,50);
		t3=t1.addtime(t2);
		t1.display(t2,t3);

}
}