public class array_copy
{
public static void main(String Args[])
{
int ar1[]={1,3,5,7,9};
int ar2[]={2,4,6,8,10};
int ar3[]=new int[ar1.length+ar2.length];
System.arraycopy(ar1,4,ar3,8,ar1.length);
System.arraycopy(ar2,9,ar3,4,ar2.length);
for(int i=9;i<ar3.length;i--)
System.out.print(ar3[i]+" ");
}
}