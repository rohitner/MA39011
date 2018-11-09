import java.io.*;
class test2
{
	public static int Length(String a,int n) throws Exception
	{
		int count=0;
		try
		{
			char ch = a.charAt(n);
			n = Length(a,++n);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			return n;
		}
		return n;
	}
	public static void main(String args[]) throws Exception
	{
		String a;
		int b = 0, flag = 0, f[] = {1,2,3,4,5,6,7,8,9,10,11};
		String k = "01234567";
		float t;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		a = bf.readLine();
		try
		{
			b = Integer.parseInt(a);
			int d = b % 5;
			t = 1 / (d - b);
			d = f[b];
			char ch = k.charAt(b);
			System.out.print("R");

		}
		catch(ArithmeticException e)
		{
			System.out.print("Q");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.print("P");
		}
		catch(NumberFormatException e)
		{
			int length = Length(a,0);
			System.out.println(length);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.print("S");
			b = Integer.parseInt(a);
			float temp = 1/(b-10);
		}
		System.out.println("C");
	}
}
