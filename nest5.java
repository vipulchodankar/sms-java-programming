public class nest5
 {
  public static void main(String Argsp[])
   {
    for(int i=1,space=0;i<5;i++,space++)
     {
 	  for(int j=space;j>0;j--)
	    { System.out.print(" "); }
      for(int j=4;j>=i;j--)
        {System.out.print("*");}
      for(int j=3;j>=i;j--)
        {System.out.print("*");}
      System.out.println();
     }

    for(int i=1,space=2;i<4;i++,space--)
    {
	 	  for(int j=space;j>0;j--)
		    { System.out.print(" "); }
	      for(int j=1;j<=i;j++)
	        {System.out.print("*");}
	      for(int j=0;j<=i;j++)
	        {System.out.print("*");}
	      System.out.println();
     }

     }
}