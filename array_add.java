 import java.io.*;
public class array_add
{
public void input()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));

double ar1[]=new double[5];
double ar2[]=new double[5];
double ar3[]=new double[5];

for(int i=0;i<5;i++)
{
System.out.println("Array 1: Enter number "+(i+1)+" :");
ar1[i]=Double.parseDouble(ob.readLine());
}

System.out.println();

for(int j=0;j<5;j++)
{
System.out.println("Array 2: Enter number "+(j+1)+" :");
ar2[j]=Double.parseDouble(ob.readLine());
}

for(int k=0;k<5;k++)
{
ar3[k]=ar1[k]+ar2[k];
}

System.out.println("");

for(int j=0;j<5;j++)
{
System.out.println(ar3[j]);
}

}

public static void main(String Args[])throws IOException
{
array_add a=new array_add();
a.input();
}
}