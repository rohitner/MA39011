import java.io.*;

class q8
{
	public static void main(String args[]) throws Exception
	{
		// DataInputStream t = new DataInputStream(System.in);
		BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
		String i;
		i = t.readLine();
		System.out.println(i.substring(i.length()-1));
	}
}