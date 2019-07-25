public class factorials2
{
public int factorial(int x)
{
int fact=1;
for(int i=1;i<=x;i++)
 {
 fact=fact*i;
 }
 return fact;
}

public void series(){
double s=0;
for(int i=1;i<=9;i++)
{
s=s+(double)i/factorial(i+1);
}
System.out.println(s);
}

public static void main(String Args[])
{
factorials2 ob=new factorials2();
ob.series();}
}
