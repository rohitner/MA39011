import java.io.*;

class kapil
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader o = new BufferedReader(new InputStreamReader(System.in));
		String in = o.readLine();
		String r = "ram";
		try
		{
			int n = Integer.parseInt(in);
			r = ""+n*n;
		}
		finally
		{
			System.out.println(r);
		}
	}
}