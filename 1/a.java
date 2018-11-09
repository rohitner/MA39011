import java.io.*;
class ram
{
	public static void main(String args[]) throws Exception
	{
		// DataInputStream t = new DataInputStream(System.in);
		BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
		String k,p;
		k = t.readLine();
		p = k.substring(2);
		System.out.println(p);
	}
}