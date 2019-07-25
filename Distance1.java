public class Distance1
{

public void cal_dist(int m,int cm)
{
int tcm=m*100+cm;
double ft=tcm/30.0;
System.out.println("Distacnce In Cm= "+tcm+"\n"+"Distance in feet= "+ft);
}

public static void main(String Args[])
{
Distance1 dt=new Distance1();
dt.cal_dist(25,200);
}
}