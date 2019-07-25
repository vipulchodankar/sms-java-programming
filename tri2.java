import java.io.*;
class tri2
{
private double s1,s2,s3;
private String ans;
public tri2()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter First side of Triangle ");
s1=Double.parseDouble(br.readLine());
System.out.println("Enter Second side of Triangle ");
s2=Double.parseDouble(br.readLine());
System.out.println("Enter Third side of Triangle ");
s3=Double.parseDouble(br.readLine());
if(s3<s1+s2 && s2<s1+s3 && s1<s2+s3)
{

if((s1*s1)==(s2*s2)+(s3*s3) || (s2*s2)==(s1*s1)+(s3*s3) || (s3*s3)==(s1*s1)+(s2*s2))
ans="Pythagoras triplet";

else
ans="Not Pythagoras triplet";
}

else
 ans="invalid";

System.out.println("Triangle = "+ans);
}

public static void main(String Args[])throws IOException
{
tri2 ob=new tri2();
}}