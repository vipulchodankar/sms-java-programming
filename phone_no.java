import java.io.*;
public class phone_no
{

 public void input()throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter number of people");
  int num=Integer.parseInt(br.readLine());
  String ppl[]=new String[num];
  Long pno[]=new Long[num];
  for(int i=0;i<num;i++)
  {
   System.out.println("Enter person"+(i+1)+"'s name");
   ppl[i]=br.readLine();
   System.out.println("Enter "+ppl[i]+"'s phone number");
   pno[i]=Long.parseLong(br.readLine());
  }
  System.out.println("Enter Person's Name");
  String name=br.readLine();
  int no,res;
  for(int i=0;i<num;i++)
  {
	  if(name.equalsIgnoreCase(ppl[i]))
	   {
		 no=i;
		 System.out.println(pno[no]);
   		}
   	  else
   		res=0;
  }
  if(res==0)
   System.out.println("Name does not exist");

 }

 public static void main(String args[])throws IOException
 {phone_no ob=new phone_no();
 ob.input();
	 }

}
