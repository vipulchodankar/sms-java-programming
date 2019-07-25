import java.io.*;
public class Triangle
{
private double a1,a2,a3;
private String type="";

public void cal()throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter first angle of triangle");
a1=Double.parseDouble(br.readLine());

System.out.println("Enter second angle of triangle");
a2=Double.parseDouble(br.readLine());

System.out.println("Enter third angle of triangle");
a3=Double.parseDouble(br.readLine());

if(a1>0 && a2>0 && a3>0)
 {

 if((a1+a2+a3)==180)
 {
  if(a1<90 && a2<90 && a3<90)
   {type="Acute";}

  else if(a1==90 || a2==90 || a3==90)
  {type="Right angled";}

  else if(a1>90 || a2>90 || a3>90)
  {type="Obtuse";}

   else
    type="invalid";

   }
  else
   type="invalid";
   }

   System.out.println("Given angles can form a/an "+type+"Triangle");
   }

   public static void main(String Args[])throws IOException
   {
   Triangle ob=new Triangle();
   ob.cal();
   }
   }