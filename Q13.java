public class Q13
{
private int rollno;
private double height,weight;

public void get(int r,double ht,double wt)
{
rollno=r;
height=ht;
weight=wt;
}

public void set(int increase)
{
height+=increase;
}

public void print()
{
System.out.println("Roll No. is "+rollno);
System.out.println("Height is "+height+"cm.");
System.out.println("Weight is "+weight+"kg.");
}

public static void main(String Args[])
{
Q13 s=new Q13();
s.get(14,150,54);
s.set(13);
s.print();
}
}