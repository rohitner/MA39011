import java.io.*;

class kapil
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader o = new BufferedReader(new InputStreamReader(System.in));
		String in = o.readLine();
		int a = 10;
		try
		{
			a = Integer.parseInt(in);
		}
		finally
		{
			a = a*a;
			System.out.println(a);
		}
	}
}