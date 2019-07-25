import java.io.*;
public class Pg_278_q_13
{
public static void main(String Args[])throws IOException
{
Pg_278_q_13 ob=new Pg_278_q_13();
ob.input();
}
public void input()throws IOException
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 String state[]={"Goa","Punjab","Karnataka"};
 String city[]={"Panaji","Haryana","Bangalore"};

   System.out.println("Enter State");
   String state_n=br.readLine();
   int no,res=1;
   for(int i=0;i<state.length;i++)
   {
 	  if(state_n.equalsIgnoreCase(state[i]))
 	   {
 		 no=i;res=0;
 		 System.out.println(state[i]+"\'s Capital City = "+city[no]);
 		 break;
        }
   }
  if(res==1)
  System.out.println("State does not exist");


}

}