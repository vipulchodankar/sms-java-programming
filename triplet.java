import java.util.*;
public class triplet
{
 public static void main(String vip[])throws InputMismatchException
 {
  Scanner sc=new Scanner(System.in);
   System.out.println("Enter 3 numbers with space:");
    String no=sc.nextLine();
      int ar[]=new int[3];
       Scanner sc1=new Scanner(no);
       int i=0;
        while(sc1.hasNext())
         {
		 	ar[i]=Integer.parseInt(sc1.next());
		 	 i++;
		    	}
		   if((ar[0]*ar[0] + ar[1]*ar[1])== ar[2]*ar[2] )
		    System.out.println(no+" is a pythagoras triplet");
		   else if((ar[2]*ar[2] + ar[1]*ar[1])== ar[0]*ar[0] )
		    System.out.println(no+" is a pythagoras triplet");
		   else if((ar[0]*ar[0] + ar[2]*ar[2])== ar[1]*ar[1] )
		    System.out.println(no+" is a pythagoras triplet");
		   else
		    System.out.println(no+" is not a pythagoras triplet");
   sc.close();
 }
}