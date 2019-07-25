class oct1
{
	public static void main(String Args[])
	{
		String a="12";
		int aa=Integer.parseInt(a);

		int b=200;
		String bb=Integer.toBinaryString(b);

		int c =123;
		String cc=Integer.toOctalString(c);

		int d=255;
		String dd=Integer.toHexString(d);

		String num=Integer.toString(989);

		System.out.println(aa);
		System.out.println(bb);
		System.out.println(cc);
		System.out.println(dd);
		System.out.println(num);
	}
}

