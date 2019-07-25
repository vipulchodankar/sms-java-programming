import java.io.*;
public class Menu_1
{
 public void input()throws IOException
 {
  BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
  
  System.out.pritnln("1. Check for prime no.");
  System.out.pritnln("2. Check for Armstrong no.");
  System.out.pritnln("3. Check for Perfect no.");
  System.out.pritnln("4. Exit");
  
  int cho=0;
  
  do
   {
    System.out.println("Enter choice :");
    cho=Integer.parseInt(br.readLine());
   }while(cho<1 || cho>4);
  
  System.out.println("Enter a number :");
  int num=Integer.parseInt(br.readLine());
  
  switch(cho)
  {
   case 1:prime(num);
   	 break;
   
   case 2:Arm(num);
   	 break;
   	
   case 3:Per(num);
   	 break;
   
   case 4:System.exit(0);
   	 break;
   }
  }
  
 public void prime(int no1)
  {
   int count=0;
   int rem=0;
   
   for(int i=1;no1%i==0;i++)
    {
     count++;
    }
    
   if(count==2)
    System.out.println(no1+" is a Prime Number");
   
   else
    System.out.println(no1+"is not a Prime Number");
  }
  
public static void main(String Args[])throws IOException
 {
  Menu_1 ob=new Menu_1();
  ob.input();
 }
}