class Item
{
private int code,price;

 	public Item(int c,int p)
 	{
 	code=c;
 	price=p;
 	}

 	public Item()
 	{
 	code=111;
 	price=100;
 	display();
 	}

 	public void display()
 	{
 	System.out.println("Price of the item is "+price);
 	System.out.println("Item code is "+code);
 	}

 	public static void main(String Args[])
 	{
 	Item ob=new Item(400,11112);
 	Item o=new Item();
 	ob.display();
 	}
 }