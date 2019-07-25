import java.io.*;
import java.util.*;
public class datalibrary
{
 private int num=0;
 private char op;


 public static void main(String vip[])throws IOException
 {
  datalibrary dl=new datalibrary();
  dl.menu();
 }

 public void menu()throws IOException
 {

  Scanner sc=new Scanner(System.in);
  byte ch;
  do{
   System.out.println("1.Add Books ");
   System.out.println("2.View Books ");
   System.out.println("3.Search Books ");
   System.out.println("4.Exit ");
   System.out.println("\n Enter Your Choice(1-4) : ");
   ch=sc.nextByte();
   }while(ch<0 || ch>4);

  switch(ch)
   {
  	case 1:add();break;

  	case 2:view(); break;

  	case 3:search(); break;

  	case 4:System.exit(0);
   }
   sc.close();
 }


 public void add()throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

  Scanner sc1=new Scanner(System.in);
  BufferedWriter bw=new BufferedWriter(new FileWriter("Book.dat",true));
  PrintWriter pw=new PrintWriter(bw);
  System.out.println("How many books do you wish to add? :}");
  int n=sc1.nextInt();

  String title,author,publish,category,code;
  float cost;
  try{
  for(int i=1;i<=n;i++)
    {sc1.nextLine();

     System.out.println("Enter book title");
     title=sc1.nextLine();

     System.out.println("Enter book code");
     code=sc1.nextLine();

     System.out.println("Enter book author");
     author=sc1.nextLine();

     System.out.println("Enter book publisher");
     publish=sc1.nextLine();

     System.out.println("Enter book category");
     category=sc1.nextLine();

     System.out.println("Enter Cost");
     cost=sc1.nextFloat();

	 num++;

     pw.println(title +" : "+ code +" : "+ author +" : "+ publish + " : " + category + " : " + cost);

  }
  }catch(InputMismatchException e1)
  {System.out.println("Invalid type");}

 pw.close();
 sc1.close();

  System.out.println("Do you wish to return to main menu?Y to continue");
 	 op=(char)br.read();
 	 if(op=='y' || op=='Y')
	 menu();

 }

 public void search()throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    try{
		System.out.println("Enter title of book you wish to find");
		String find=br.readLine();
     Scanner sc1=new Scanner(new FileReader("Book.dat"));

     String title,code,author,publish,category,str;
     float cost;

     while(sc1.hasNextLine())
     {
      str=sc1.nextLine();
      Scanner sc3=new Scanner(str).useDelimiter(" : ");

      title=sc3.next();
      if(find.equalsIgnoreCase(title))
      {
	  code=sc3.next();
      author=sc3.next();
      publish=sc3.next();
      category=sc3.next();
      cost=sc3.nextFloat();


      System.out.println(title+"\t"+code+"\t"+author+"\t"+publish+"\t"+category+"\t"+cost);
  }
      sc3.close();
      num++;

     }

	 	 sc1.close();
     }catch(FileNotFoundException e2)
     {
	 System.out.println("File Not Found");
	 }

	 System.out.println("Do you wish to return to main menu?Y  to continue");
	 op=(char)br.read();
	 if(op=='y' || op=='Y')
	 menu();



   }



 public void view()throws IOException
 {
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 Scanner sc1=new Scanner(System.in);

	 try{
	      Scanner sc2=new Scanner(new FileReader("Book.dat"));

	      String title,code,author,publish,category,str;
	      float cost;
	      String ar_title[]=new String[num];
	      String ar_code[]=new String[num];
	      String ar_author[]=new String[num];
	      String ar_publish[]=new String[num];
	      String ar_category[]=new String[num];
	      float ar_cost[]=new float[num];
	      int i=0;

	      while(sc2.hasNextLine())
	      {
	       str=sc2.nextLine();
	       Scanner sc3=new Scanner(str).useDelimiter(" : ");
	       ar_title[i]=sc3.next();

	       ar_code[i]=sc3.next();
	       ar_author[i]=sc3.next();
	       ar_publish[i]=sc3.next();
	       ar_category[i]=sc3.next();
	       ar_cost[i]=sc3.nextFloat();
	       i++;
	      }

	      String t1,t2,t3,t4,t5;
	      float t6;

	      for(int j=0;j<ar_title.length;j++)
	      {
			  for(int k=0;k<ar_title.length-1;k++)
			  {
				  if(ar_title[j].compareTo(ar_title[j+1]) > 0)
				  {
					  t1=ar_title[j];
					  ar_title[j]=ar_title[j+1];
					  ar_title[j+1]=t1;

					  t2=ar_code[j];
			  		  ar_code[j]=ar_code[j+1];
					  ar_code[j+1]=t2;

					  t3=ar_author[j];
					  ar_author[j]=ar_author[j+1];
					  ar_author[j+1]=t3;

					  t4=ar_publish[j];
					  ar_publish[j]=ar_publish[j+1];
					  ar_publish[j+1]=t4;

					  t5=ar_category[j];
					  ar_category[j]=ar_category[j+1];
					  ar_category[j+1]=t5;

					  t6=ar_cost[j];
					  ar_cost[j]=ar_cost[j+1];
					  ar_cost[j+1]=t6;

					  System.out.println(ar_title[j]+"\t"+ar_code[j]+"\t"+ar_author[j]+"\t"+ar_publish[j]+"\t"+ar_category[j]+"\t"+ar_cost[j]);

				  }
			  }
		  }

	      sc2.close();

	      }catch(FileNotFoundException e3)
	      {
	 	 System.out.println("File Not Found");

	 	  System.out.println("Do you wish to return to main menu?Y to continue");
		 	 op=(char)br.read();
		 	 if(op=='y' || op=='Y')
	 menu();
	 }




 }

}
