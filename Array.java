import java.io.*;
public class Array
 {

  public static void main(String Args[])throws IOException
   {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String name[]=new String[100];
    for(int i=0;i<name.length;i++)
     {
      System.out.println("Enter name "+(i+1));
      name[i]=br.readLine();
      name[i]=name[i].toUpperCase();
      System.out.println("Name in capitals : "+name);
     }
    }
 }