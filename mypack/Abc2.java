package mypack;
public class Abc2
{
 public void fact(int x)
 {
 int fact=1;
 for(int i=1;i<=x;i++)
  {
  fact=fact*i;
  System.out.println(fact);
  }

 }

 public void perfect()
 {
  int fact=0;
  System.out.println("Perfect no from 100 nd 500");
  for(int num=100;num<501;num++)
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

  public void arm()
  {      int num=1000;
         int rem=0;
 	 int sum=0;

     while(num>0)
      	{
       	 rem=num%10;
       	 sum=sum+(rem*rem*rem);
       	 num=num/10;
      	 System.out.println(sum);
      	 }


 }
 }