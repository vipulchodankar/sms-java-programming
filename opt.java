import java.io.*;
class opt
{
private double no1,no2,res;

public void input()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Available Options :- ");
System.out.println("1. Add (no1. + no2.)");
System.out.println("2. Subtract (no.1 - no.2)");
System.out.println("3. Multiply (no.1 * no.2)");
System.out.println("4. Divide (no.1 / no.2)");
System.out.println("5. Find Remainder (no.1 % no.2)");
System.out.println("6. Exponent (no1^no.2)");
System.out.println("7. Square Root of no.1");
System.out.println("8. Exit \n");

System.out.println("Enter first number :");
no1 = Double.parseDouble(br.readLine());

System.out.println("Enter second number :");
no2 = Double.parseDouble(br.readLine());
cal();
}

public void cal()throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("\n Select Option :- ");
System.out.println("1. Add (no1. + no2.)");
System.out.println("2. Subtract (no.1 - no.2)");
System.out.println("3. Multiply (no.1 * no.2)");
System.out.println("4. Divide (no.1 / no.2)");
System.out.println("5. Find Remainder (no.1 % no.2)");
System.out.println("6. Exponent (no1^no.2)");
System.out.println("7. Square Root of no.1");
System.out.println("8. Exit \n");


int op=Integer.parseInt(br.readLine());

switch(op)
{
  case 1:
   { res=no1+no2;
    System.out.println(no1+"+"+no2+" = "+res);
    break; }

  case 2:
   { res=no1-no2;
    System.out.println(no1+"-"+no2+" = "+res);
    break; }

  case 3:
  { res=no1*no2;
   System.out.println(no1+"*"+no2+" = "+res);
   break; }

  case 4:
   { res=no1/no2;
    System.out.println(no1+"/"+no2+" = "+res);
    break; }

  case 5:
   { res=no1%no2;
    System.out.println(no1+"%"+no2+" = "+res);
    break; }

  case 6:
   { res=Math.pow(no1,no2);
    System.out.println(no1+"^"+no2+" = "+res);
    break; }

  case 7:
   { res=Math.sqrt(no1);
    System.out.println("sq. root of "+no1+" = "+res);
    break; }

  case 8:
  { System.exit(0);
   break;}

  default:
  {System.out.println("Invalid");
  res=0;
   break; }

  }
  }

  public static void main(String Args[])throws IOException
  {
  opt ob=new opt();
  ob.input();
 }
  }