package mypack;
public class Abc
{
 public int fact(int x)
 {
 int fact=1;
 for(int i=1;i<=x;i++)
  {
  fact=fact*i;
  }
  return fact;
 }

 public void perfect()
 {
  int fact=0;
  System.out.println("Perfect no from 0 nd 100");
  for(int num=1;num<501;num++)
  {

      for(int i=1;i<num;i++)
       {
        if(num%i==0)
         fact=fact+i;
       }

   if(fact==num)
     System.out.print(num+" ");
     fact=0;
  }
   System.out.println("  ");
 }

  public void arm(int num1)
  {      int num=1000;
         int rem=0;
 	 int sum=0;

     while(num1>0)
      	{
       	 rem=num1%10;
       	 sum=sum+(rem*rem*rem);
       	 num1=num1/10;
      	 System.out.println(sum);
      	 }


 }
 }