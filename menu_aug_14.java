import java.io.*;
public class menu_aug_14
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 public static void main(String Args[])throws IOException
 {
  menu_aug_14 ob=new menu_aug_14();
  ob.input();
 }

 public void input()throws IOException
 {
  System.out.println("1.To check and display if a no. inputted by user is a composite no. \n2.To find minimum digit from no. entered by user\n3.Exit\nEnter Choice:");
  int ch=Integer.parseInt(br.readLine());

  System.out.println("Enter A Number");
  int num=Integer.parseInt(br.readLine());

  switch(ch)
  {
	  case 1:comp(num);break;

	  case 2:min(num);break;

	  case 3:System.exit(0);
}

 }

 public void comp(int num)throws IOException
 {
  int ctr=0;
  for(int i=1;i<=num;i++)
  {
   if(num%i==0)
    ctr++;
  }
  if(ctr!=2)
   System.out.println(num+" is a composite number\n");
  else
   System.out.println(num+" is not a composite number\n");
   input();
 }

 public void min(int num)throws IOException
 {
  int min=num%10;
  int num2=num,rem;
  while(num>0)
   {
	   rem=num%10;
	   if(rem<min)
	    min=rem;
	   num/=10;
	}
  System.out.println("Minimum number is "+min+"\n1");
 input();
 }
}