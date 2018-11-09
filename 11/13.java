import java.io.*;

class kapil
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader o = new BufferedReader(new InputStreamReader(System.in));
		String in = o.readLine();
		try
		{
			Integer.parseInt(in);
			System.out.println('A');
		}
		finally
		{
			System.out.println('B');
		}
		System.out.println('C');
	}
}