import java.io.*;

class q11
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
				count++;
			}
			if(count == 4)
			{
				System.out.println(i.substring(j+1));
				break;
			}
		}
	}
}