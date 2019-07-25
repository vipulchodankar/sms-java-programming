public class sub_pattern
{
public void input()
{
int arr[]={2,6,12,20,30,42};

for(int i=arr.length-1;i>=0;i--)
{
for(int j=0;j<=i;j++)
System.out.print(arr[j]+" ");

System.out.println();

for(int j=0;j<i;j++)
arr[j]=arr[j+1]-arr[j];
}

}

public static void main(String Args[])
{
sub_pattern ob=new sub_pattern();
ob.input();
}
}
