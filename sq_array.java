public class sq_array
{

public void cal_sq(int ar[])
{
for(int i=0;i<ar.length;i++)
ar[i]=ar[i]*ar[i];
}

public static void main(String Args[])
{
int ar[]={10,20,30,40,50,60,70,80,90,100};
sq_array ob=new sq_array();
ob.cal_sq(ar);
for(int i=0;i<ar.length;i++)
System.out.println(ar[i]);
}

}
