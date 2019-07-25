import java.io.*;
public class call_emp
{
Employee_2 e[]=new Employee_2[10];

public static void main(String Args[])throws IOException
{

for(int i=0;i<e.length;i++)
{
e[i]=new Employee_2();
e[i].input();
e[i].cal();
e[i].display();
}

}

}