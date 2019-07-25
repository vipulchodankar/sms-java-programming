public class nest3
{
public static void main(String Args[])
{
 int space =1;
 int x;
 for(int i=5;i>0;i--)
  {

   for(int j=1;j<=i;j++)
    {
     System.out.print(j);
    }

   if(i==5)
    x=i-1;
   else
    x=i;

    if(i!=5)
      {
       for(int k=1;k<=space;k++)
        {
         System.out.print(" ");
        }
		space+=2;
	}
       for(int j=x;j>0;j--)
        System.out.print(j);

        System.out.println();

     }
    }
   }