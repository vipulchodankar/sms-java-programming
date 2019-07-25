class Index
{

public static void main(String Args[])
{
String s="";
s="Monday Tuesday Wednesday";
int ind,ind1,ind2;
ind=s.indexOf("day");
ind1=s.indexOf("day",4);
ind2=s.indexOf("day",12);
System.out.println(ind+"	"+ind1+"	"+ind2+"	");
}
}