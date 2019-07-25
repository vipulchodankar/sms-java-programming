import java.io.*;
import java.util.*;
public class filewrite
{
 private String itemname,itemcode,sport;
 private Float cost;

 public static void main(String vip[])throws IOException
 {
  filewrite ob=new filewrite();
  ob.fw();
 }

 public void fw()throws IOException
 {
  Scanner s=new Scanner(System.in);
  BufferedWriter bw=new BufferedWriter(new FileWriter("sport8.apk",true));
  PrintWriter pw=new PrintWriter(bw);

  System.out.println("How many sport items do u want to add in the file?");
  int no=s.nextInt();

  for(int i=1;i<=no;i++)
  {
   System.out.println("Enter item name");
   itemname=s.next();

   System.out.println("Enter item code");
   itemcode=s.next();

   System.out.println("Sport name");
   sport=s.next();

   System.out.println("Enter Cost");
   cost=s.nextFloat();
   pw.println(itemname +"-"+ itemcode +"-"+ sport +"-"+ cost);
  }


  pw.close();
  s.close();}}