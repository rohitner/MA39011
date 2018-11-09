import java.io.*;

class q2
{
	public static void main(String args[]) throws Exception
	{
		// DataInputStream t = new DataInputStream(System.in);
		BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
		String i, o;
		i = t.readLine();
		o = i.substring(0,2) + i.substring(4);
		System.out.println(o);
	}
}