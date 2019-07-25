class Q6
{
	private int rollno;
	private double height,weight;

	public Q6(int r,double h,double w)
	{
	rollno=r;
	height=h;
	weight=w;
	}

	public Q6()
	{
	rollno=8;
	height=5.5;
	weight=50;
	display();
	}

	public void display()
	{
	System.out.println("Roll no. is"+rollno);
	System.out.println("Height is "+height);
	System.out.println("Weight is "+weight);
	}

	public static void main(String Args[])
	{
	Q6 one=new Q6(33,5.5,54);
	Q6 two=new Q6();
	one.display();
	}
}