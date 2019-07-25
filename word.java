import java.util.*;
public class word
{
 public static void main(String vip[])
 {
	 Scanner sc=new Scanner(System.in);

	  String word1="",str=sc.nextLine();

	  Scanner sc1=new Scanner(str).useDelimiter(",");

	  while(sc1.hasNext())
	  {
	   word1=sc1.next();
	   System.out.println(word1); }

 }
