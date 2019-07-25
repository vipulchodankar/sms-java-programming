import java.io.*;
class Month
{
private int mon,days;

public void cal()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Month Number :");
mon=Integer.parseInt(br.readLine());

switch(mon)
{
 case 6:
 case 4:
 case 9:
 case 11:
 {days=30;break;}

 case 1:
 case 3:
 case 5:
 case 7:
 case 8:
 case 10:
 case 12:
  {days=31;break;}
 case 2:
  {days=28;break;}

 default:
 {days=0; System.out.println("Invalid month no.");break;}
}
System.out.println("No. Of Days = "+days);
}

public static void main(String Args[])throws IOException
{
Month ob=new Month();
ob.cal();
}


}
