import java.io.*;
class Student1
{


	public static void main(String Args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Student's Name ");
		String name=br.readLine();

		System.out.println("Enter Studemt's roll no. ");
		String rollno=br.readLine();

		System.out.println("Enter Total marks ");
		double tmarks=Double.parseDouble(br.readLine());

		System.out.println("Enter Student's grade ");
		char g=(char)br.read();

		double avg=tmarks/3.0;

		System.out.println("Student's name is "+name);
		System.out.println("Student's roll no. is "+rollno);
		System.out.println("Student's Total marks is "+tmarks);
		System.out.println("Student's Average marks "+avg);
		System.out.println("Student's  Grade is "+g);

		System.out.println("Enter Anything");
	for(int i=1;i++;i=100)
	{	String n=br.readLine();	}
}
}