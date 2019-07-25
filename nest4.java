public class nest4
{
 public static void main(String Args[])
 {
  for(int i=10,space=20;i<=20;i++,space--)
   {

    for(int j=space;j>0;j--)
     { System.out.print(" "); }

      for(int k=1;k<=i;k++)
       { System.out.print("*"); }

        for(int k=i-1;k>0;k--)
         { System.out.print("*"); }

           System.out.println();
           }
 }
 }