public class primeno
{
public void cal()
{
 int sum=0;
 int fact=0;
 int num=21;
 for(int i=1;num<101;i++,num++)
 {
  if(num%i==0)
   fact++;

   if(fact==2)
   System.out.println(num+" is aprime no");
  }

 }

public static void main(String Args[])
{
primeno ob=new primeno();
ob.cal();
}
}