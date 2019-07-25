import java.util.*;
 public class ScanConsoleApp
 {
  public static void main(String Args[])
  {
   Scanner scanner = new Scanner(System.in);
   try
   {
    System.out.println("Enter an Integer :");
    int v1=scanner.nextInt();
    System.out.println("You entered : "+v1);

    System.out.println("Enter a float value :");
    float v2=scanner.nextFloat();
    System.out.println("You entered : "+v2);

    System.out.println("Enter a double value :");
    double v3=scanner.nextDouble();
    System.out.println("You entered : "+v3);

     scanner.nextLine();

	System.out.println("Enter a Sentence :");
    String v5=scanner.nextLine();
    System.out.println("You entered : "+v5);
   }
   catch(InputMismatchException e)
   {
    System.out.println("Mismatch exception:"+e);
   }
  }
  }