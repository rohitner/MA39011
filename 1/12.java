import java.io.*;

class q12
{
	public static void main(String args[]) throws Exception
	{
		// DataInputStream t = new DataInputStream(System.in);
		BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
		String i;
		Integer d = 0,count = 0, count1 = 0, a, b, c, sum = 0;
		i = t.readLine();
		for (int j = 0 ; j<i.length() ; j++)
		{
			if (i.charAt(j) == 'x')
			{
				d++;
				count = count1 + 1;
				count1 = j;
				if(d == 1)
				{
					count = 0;
				}
				sum+=Integer.valueOf(Integer.parseInt(i.substring(count,count1)));
			}
			if(d == 3)
			{
				System.out.println(sum);
				break;
			}
		}
	}
}