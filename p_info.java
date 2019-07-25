import java.util.*;
public class p_info
{
 public static void main(String mel[])
 {
  p_info ob=new p_info();
  ob.input();
 }

 public void input()throws InputMismatchException
 {
  Scanner sc=new Scanner(System.in);

  System.out.println("Enter your full name :");
  String name=sc.nextLine();

  System.out.println("Enter your Perm no :");
  short perm=sc.nextShort();

  sc.nextLine();
  System.out.println("Enter your date of birth :");
  String dob=sc.nextLine();

  System.out.println("Enter your house colour :");
  String hc=sc.next();

  System.out.println("Full name :"+name);
  System.out.println("Perm no :"+perm);
  System.out.println("Dob :"+dob);
  System.out.println("House colour :"+hc);

  sc.close();
 }
}
