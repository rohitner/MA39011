import java.io.*;

class q11b
{
	public static void main(String args[]) throws Exception
	{
		// DataInputStream t = new DataInputStream(System.in);
		BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
		String i;
		Integer count = 0;
		i = t.readLine();
		for (int j = 0 ; j<i.length() ; j++)
		{
			if (i.charAt(j) == 'x')
			{
				count = j;
			}
		}
		System.out.println(i.substring(count + 1));
	}
}