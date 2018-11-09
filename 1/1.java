import java.io.*;

class q1
{
	public static void main(String args[]) throws Exception
	{
		// DataInputStream t = new DataInputStream(System.in);
		BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
		String i1, i2, o1, o2, o;
		i1 = t.readLine();
		i2 = t.readLine();
		o1 = i1.substring(1);
		o2 = i2.substring(1);
		o  = o1 + o2;
		System.out.println(o);
	}
}