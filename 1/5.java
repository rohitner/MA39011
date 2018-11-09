import java.io.*;

class q5
{
	public static void main(String args[]) throws Exception
	{
		// DataInputStream t = new DataInputStream(System.in);
		BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
		int x;
		x = Integer.valueOf(t.readLine());
		x = x*2;
		String o = x+"";
		System.out.println(o.substring(0,2)+o.substring(3));
	}
}