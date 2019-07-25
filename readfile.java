import java.util.*;
import java.io.*;
public class readfile
{
 public static void main(String args[])
 {
  try{
   Scanner sc=new Scanner(new FileReader("sport.dat"));

   String str,code,name,sport;
   double cost;

   while(sc.hasNextLine())
   {
    str=sc.nextLine();
    System.out.println(str);
    Scanner sc2=new Scanner(str).useDelimiter("-");
    name=sc2.next();
    code=sc2.next();
    sport=sc2.next();
    cost=sc2.nextDouble();
    System.out.println(name+"\t"+code+"\t"+sport+"\t"+cost);
   }
   sc.close();
   }catch(FileNotFoundException e)
   {System.out.println("File Not Found");}
   }
   }
