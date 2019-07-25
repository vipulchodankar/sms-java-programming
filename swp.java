public class swp
{
public void swp(float a,float b)
{
float c=a;
a=b;
b=c;
System.out.println("="+a+b+c);
}
public static void main(String Args[])
{
swp s=new swp();
s.swp(30,21);
}
}