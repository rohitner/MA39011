import java.io.*;

class q4
{
	public static void main(String args[]) throws Exception
	{
		// DataInputStream t = new DataInputStream(System.in);
		BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
		String i;
		int x;
		i = t.readLine();
		x = Integer.valueOf(t.readLine());
		char o = i.charAt(x);
		System.out.println(o);
	}
}