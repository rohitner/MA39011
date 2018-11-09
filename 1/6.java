import java.io.*;

class q6
{
	public static void main(String args[]) throws Exception
	{
		// DataInputStream t = new DataInputStream(System.in);
		BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
		int x;
		x = Integer.valueOf(t.readLine());
		String o = x+"";
		System.out.println(o.charAt(Integer.parseInt(String.valueOf(o.charAt(0)))));
	}
}