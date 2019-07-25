class check2
{
	public static void main(String Args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a decimal no");
	float f=Float.ParseFloat(br.readLine());
	System.out.println("Enter a decimal no");
	Long n=LOng.parseLong(br.readLine());
	System.out.println("Enter your First Name ");
	String f=br.readLine();
	System.out.println("Enter your Middle Name ");
	String m=br.readLine();
	System.out.println("Enter your SurName ");
	String s=br.readLine();

	String full=f+" "+m+" "+s;
	System.out.println("Converted no=  "+f);
	System.out.println("Converted real no.");
}
}