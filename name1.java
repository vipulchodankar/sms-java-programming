public class name1
{
private String name="Vipul Vijay Chodankar";
private int len;

public void input()
{
String n=new String(name);
System.out.println(n.toUpperCase());
System.out.println(n.toLowerCase());
System.out.println(n.length());
System.out.println(n.charAt(6));
System.out.println(n.charAt(12));
System.out.println(n.charAt(20));
}

public static void main(String Args[])
{
name1 ob=new name1();
ob.input();
}


}
