import java.io.*;

class q10
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
				System.out.println(i.charAt(j+1));
				count++;
			}
			if(count == 2)
			{
				break;
			}
		}
		if(count == 1)
		{
			System.out.println("abs");
		}
	}
}