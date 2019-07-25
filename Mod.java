import java.io.*;
import java.util.*;
public class Mod
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	public static void main(String Args[])throws IOException
	{
		Mod m=new Mod();
		m.menu();
	}

	public void menu()
	{
	 System.out.println("Enter book no to be modified");
	 String bk_no=br.readLine();

	 System.out.println("1) mod title ");
	 System.out.println("2) EXIT ");
	 System.out.println("enter choice");
	 int ch=Integer.parseInt(br.readLine());

	 switch(ch)
	 {
		 case 1:mod_title(bk_no);break;

		 case 2: System.exit(0);
	 }


	}

	public void mod_title(String bkno)
	{
		Scanner s=new Scanner(new FileReader("Book.dat"));
		PrintWriter pw=new PrintWriter(new FileWriter("temp.dat"));
		String str,new_title,bookno,title,author,publisher;
		double cost;

		while(s.hasNextLine())
		{
			str=s.nextLine();
			Scanner s1=new Scanner(str).useDelimiter(" : ");

			if(bkno.equalsIgnoreCase(bookno))
			{
				title=s1.next();
				author=s1.next();
				publisher=s1.next();
				cost=s1.nextDouble();
				System.out.println("The existing title of the book is : "+title);
				System.out.println("Enter new book title");
				new_title=br.readLine();
				pw.println(bookno+" : "+new_title+" : "+author+" : "+publisher+" : "+cost);
			}
			else
			{
				pw.println(str);
			}
			s.close();
			pw.close();

			File temp=new File("temp.dat");
			File book=new File("Book.dat");
			book.delete();
			boolean success=temp.renameTo(book);

			if(success)
			 System.out.println("Successfully renamed");
			else
			 System.out.println("Not Successfullt renamed");
		}
	}
}

