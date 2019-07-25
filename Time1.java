public class Time1
{
	private int hr,min,sec;

	public Time1(int h,int m,int s)
	{hr=h;min=m;sec=s;}

	public Time1()
	{hr=1;min=1;sec=0;}

	public Time1(int h,int m)
	{hr=h;min=m;sec=0;}

	public Time1(int m,double s)
	{hr=1;min=m;sec=(int)s;}

	public void display()
	{System.out.println("Time = "+hr+"hrs: "+min+"min: "+sec+"sec");}

	public static void main(String Args[])
	{
	Time1 t1=new Time1 (5,10,20);
	Time1 t2=new Time1 ();
	Time1 t3=new Time1 (4,6);
	Time1 t4=new Time1 (6,59);
	t1.display();
	t2.display();
	t3.display();
	t4.display();
}
}