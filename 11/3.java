import java.io.*;

class kapil
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader o = new BufferedReader(new InputStreamReader(System.in));
		String in = o.readLine();
		String r = in;
		try
		{
			int n = Integer.parseInt(in);
			System.out.println(n*2);
			System.out.println(n);
			r = Integer.toString(n*n);
		}
		finally
		{
			System.out.println(r);
		}
	}
}