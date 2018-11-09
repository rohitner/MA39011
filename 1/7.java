import java.io.*;

class q7
{
	public static void main(String args[]) throws Exception
	{
		// DataInputStream t = new DataInputStream(System.in);
		BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
		String i1, i2, i3, o;
		i1 = t.readLine();
		i2 = t.readLine();
		i3 = t.readLine();
		if(i1.compareTo(i2) >= 0)
		{
			if(i1.compareTo(i3) >= 0)
			{
				o = i1;
			}
			else
			{
				o = i3;
			}
		}
		else
		{
			if(i2.compareTo(i3) >= 0)
			{
				o = i2;
			}
			else
			{
				o = i3;
			}
		}
		System.out.println(o);
	}
}