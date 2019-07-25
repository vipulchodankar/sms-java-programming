import java.io.*;
public class Student_Percent
{
public void input()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Number Of Students :");
int num=Integer.parseInt(br.readLine());
double temp_perc;
String temp_name;
String name[]=new String[num];
double perc[]=new double[num];

for(int i=0;i<num;i++)
{
System.out.println("Enter Student"+(i+1)+"'s Name :");
name[i]=br.readLine();
System.out.println("Enter "+name[i]+"'s Percentage :");
perc[i]=Double.parseDouble(br.readLine());
System.out.println();
}

for(int i=0;i<num;i++)
{
for(int j=0;j<num-1;j++)
{
if(perc[j]<perc[j+1])
{
temp_perc=perc[j];
perc[j]=perc[j+1];
perc[j+1]=temp_perc;

temp_name=name[j];
name[j]=name[j+1];
name[j+1]=temp_name;
}
}
}
System.out.println();
for(int i=0;i<num;i++)
{
System.out.println(name[i]+"\t"+perc[i]);
}
}

public static void main(String Args[])throws IOException
{
Student_Percent ob=new Student_Percent();
ob.input();
}
}
