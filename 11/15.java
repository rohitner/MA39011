import java.io.*;

class kapil
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader o = new BufferedReader(new InputStreamReader(System.in));
		String in = o.readLine();
		try
		{
			int num = in.length()-1;
			num = 1/(Math.min(num,5)-5);
			System.out.println('A');
		}
		finally
		{
			System.out.println('B');
		}
		System.out.println('C');
	}
}
