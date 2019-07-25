public class array_copy2
{
public static void main(String Args[])
{
int ar1[]={1,3,5,7,9};
int ar2[]={2,4,6,8,10};
int ar3[]=new int[ar1.length+ar2.length];

System.arraycopy(ar2,0,ar3,0,3);
System.arraycopy(ar1,0,ar3,3,3);
System.arraycopy(ar2,ar1.length-2,ar3,6,2);
System.arraycopy(ar1,ar2.length-2,ar3,8,2);


for(int i=0;i<ar3.length;i++)

System.out.print(ar3[i]+" ");
}
}