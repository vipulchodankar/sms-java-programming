public class comparing
 {

  public static void main(String Args[])
  {
  String s1="(_x_)";
  String s2="WAN2:-*";
    System.out.println(s2);
  System.out.println(s1);

  boolean ans=s1.equals(s2);
  System.out.println(ans);
  ans =s1.equalsIgnoreCase(s2);
  System.out.println(ans);
  int x=s1.compareTo(s2);
  System.out.println(x);

  String name="vipul vijay chodankar";
  String midname=name.substring(6,11);
    System.out.println(midname);

  }
 }