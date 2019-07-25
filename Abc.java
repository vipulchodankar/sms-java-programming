public class Abc
{
	int a=10;
	void change(int x)
	{
		x=x+10;
		System.out.println("Value of x : "+x);
	}

	public static void main(String Args[])
	{
		Abc obj=new Abc();
		System.out.println("Value of a : "+obj.a);
		obj.change(obj.a);
		System.out.println("Value of a : "+obj.a);
	}
}