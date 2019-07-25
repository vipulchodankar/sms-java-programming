import java.io.*;
public class Menu_1
{
 public void input()throws IOException
 {
  BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

  System.out.println("1. Check for prime no.");
  System.out.println("2. Check for Armstrong no.");
  System.out.println("3. Check for Perfect no.");
  System.out.println("4. Check for Palidrome no.");
  System.out.println("5. Exit");

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

   case 4:pal(num);
     break;

   case 5:System.exit(0);
   	 break;
   }
  }

 public void prime(int no1)throws IOException
  {
   int count=0;
   int rem=0;

   for(int i=1;i<=no1;i++)
    {
     if(no1%i==0)
     count++;
    }

   if(count==2)
    System.out.println(no1+" is a Prime Number \n");

   else
    System.out.println(no1+"is not a Prime Number \n");

  input();
  }

 public void Arm(int no2)throws IOException
 {
  int rem=0;
  int sum=0;int num2=no2;
  while(no2>0)
       	{
        	 rem=no2%10;
        	 sum=sum+(rem*rem*rem);
        	 no2=no2/10;
        	 }

  		if(sum==num2)
  		System.out.println(num2+" is an Armstrong number \n");
  		else
  		System.out.println(num2+" is not an Armstrong number \n");

 input();
 }

 public void Per(int no3)throws IOException
 {
   int fact=0;
   for(int no=1;no<no3;no++)
   {

         if(no3%no==0)
          fact=fact+no;
	}
    if(fact==no3)
      System.out.println(no3+" is a Perfect no. \n");
    else
      System.out.println(no3+" is not a Perfect no. \n");
  input();
 }

public void pal(int no4)throws IOException
{
     int rev=0;
     int rem;
     int num4=no4;

     while(no4>0)
     {
       rem=no4%10;
       rev=rev*10+rem;
       no4=no4/10;
     }
     if(rev==num4)
     {
     System.out.println(num4+" is a palidrome number");}
     else
     {System.out.println(num4+" is a not palidrome number");}
input();
}


public static void main(String Args[])throws IOException
 {
  Menu_1 ob=new Menu_1();
  ob.input();
 }
}