class Student

{

private double phy,chem,bio,avg_phy,avg_chem,avg_bio;
private String name;

void input(String n, double p,double c,double b)

{

name=n;

phy=p;

chem=c;

bio=b;
}

void avg(Student s2,Student s3)

{

avg_phy=(phy+s2.phy+s3.phy)/3;

avg_chem=(chem+s2.chem+s3.chem)/3;

avg_bio=(bio+s2.bio+s3.bio)/3;

System.out.println("Average of Physics = "+avg_phy);

System.out.println("Average of  Chem = "+avg_chem);

System.out.println("Average of  Bio = "+avg_bio);

}

public static void main(String Args[])

{

Student s1=new Student();

Student s2=new Student();

Student s3=new Student();

s1.input("Vipul C",95,97,92);

s2.input("Kritik",95,96,98);

s3.input("Jared",94,97,93);

s1.avg(s2,s3);

}

}