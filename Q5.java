class Q5
{
	private int day,month,year;

	public void yearplus()
	{
		year+=1;
	}

	public Q5(int d,int m,int y)
	{day=d;
	month=m;
	year=y;
	}

	public Q5()
	{day=3;
	month=5;
	year=2000;
	}

	public void display()
	{
	System.out.println("Date - 0"+day+"/0"+month+"/"+year);
	}

	public static void main(String Args[])
	{
		Q5 o=new Q5(5,6,2000);
		Q5 t=new Q5();
		o.yearplus();
		o.display();
		t.yearplus();
		t.display();
	}
}