class PerfNo
{

public void cal()
{
int fact=0;
System.out.println("Perfect no from 100 to 500");
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

public static void main(String Args[])
{
PerfNo ob=new PerfNo();
ob.cal();
}
}



