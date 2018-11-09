import java.io.*;

class q3
{
	public static void main(String args[]) throws Exception
	{
		// DataInputStream t = new DataInputStream(System.in);
		BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
		String i, o;
		i = t.readLine();
		o = i.substring(0,2) + i.substring(5,6) + i.substring(3,5) + i.substring(2,3) + i.substring(6);
		System.out.println(o);
	}
}