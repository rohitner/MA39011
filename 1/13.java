import java.io.*;

class q13
{
	public static void main(String args[]) throws Exception
	{
		// DataInputStream t = new DataInputStream(System.in);
		BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
		String i;
		Integer count = 0;
		i = t.readLine();
		char a[] = i.toCharArray();
		char temp = a[0];
		a[0] = a[1];
		a[1] = temp;
		System.out.println(a);
	}
}